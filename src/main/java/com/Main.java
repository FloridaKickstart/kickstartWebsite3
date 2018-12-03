/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Map;

@Controller
@SpringBootApplication
public class Main {

  @Value("${spring.datasource.url}")
  private String dbUrl;

  @Autowired
  private DataSource dataSource;

  public static void main(String[] args) throws Exception {
    SpringApplication.run(Main.class, args);
  }

  @RequestMapping("/index")
  String index() {
    return "index";
  }
  @RequestMapping("/aboutus")
  String aboutus() {
      return "aboutus";
  }
  @RequestMapping("/onlinecourses")
  String onlinecourses() {
      return "onlinecourses";
  }

  @RequestMapping("/onlineresources")
  String onlineresources() {
      return "onlineresources";
  }
  @RequestMapping("/onlineresourcesbluejdownload")
  String onlineresourcesbluejdownload() {
      return "onlineresourcesbluejdownload";
}
@RequestMapping("/onlineresourcesatomdownload")
  String onlineresourcesatomdownload() {
      return "onlineresourcesatomdownload";
}
@RequestMapping("/onlineresourcesbracketsdownload")
  String onlineresourcesbracketsdownload() {
      return "onlineresourcesbracketsdownload";
}
@RequestMapping("/onlineresourcesintellliJdownload")
    String onlineresourcesintellliJdownload() {
        return "onlineresourcesintellliJdownload";
}
@RequestMapping("/onlineresourcespycharmdownload")
    String onlineresourcespycharmdownload() {
        return "onlineresourcespycharmdownload";
    }
@RequestMapping("/onlineresourcesvisualStudiodownload")
    String onlineresourcesvisualStudiodownload() {
        return "onlineresourcesvisualStudiodownload";
}

  @RequestMapping("/c++unit1vid")
  String c++unit1vid() {
      return "c++unit1vid";
  }
  @RequestMapping("/c++lessons")
  String c++lessons() {
      return "c++lessons";
  }
  @RequestMapping("/c++unit1nearpod")
  String c++unit1nearpod() {
      return "c++unit1nearpod";
  }
    @RequestMapping("/c++unit1activity")
  String c++unit1activity() {
      return "c++unit1activity";
  }
   @RequestMapping("/c++unit1assessment")
  String c++unit1activity() {
      return "c++unit1assessment";
  }
  @RequestMapping("/c++unit1feedback")
  String c++unit1feedback() {
      return "c++unit1feedback";
  }
   @RequestMapping("/financelessons")
  String financelessons() {
      return "financelessons";
  }
   @RequestMapping("/finance1unit1vid")
  String finance1unit1vid() {
      return "finance1unit1vid";
  }
   @RequestMapping("/finance1unit1nearpod")
  String finance1unit1nearpod() {
      return "finance1unit1nearpod";
  }
   @RequestMapping("/finance1unit1activity")
  String finance1unit1activity() {
      return "finance1unit1activity";
  }
   @RequestMapping("/finance1unit1assessment")
  String finance1unit1assessment() {
      return "finance1unit1assessment";
  }
   @RequestMapping("/finance1unit1activity")
  String finance1unit1activity() {
      return "finance1unit1activity";
  }

  @RequestMapping("/db")
  String db(Map<String, Object> model) {
    try (Connection connection = dataSource.getConnection()) {
      Statement stmt = connection.createStatement();
      stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
      stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
      ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

      ArrayList<String> output = new ArrayList<String>();
      while (rs.next()) {
        output.add("Read from DB: " + rs.getTimestamp("tick"));
      }

      model.put("records", output);
      return "db";
    } catch (Exception e) {
      model.put("message", e.getMessage());
      return "error";
    }
  }

  @Bean
  public DataSource dataSource() throws SQLException {
    if (dbUrl == null || dbUrl.isEmpty()) {
      return new HikariDataSource();
    } else {
      HikariConfig config = new HikariConfig();
      config.setJdbcUrl(dbUrl);
      return new HikariDataSource(config);
    }
  }

}
