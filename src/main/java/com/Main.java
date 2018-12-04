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
//####COMMENTED OUT DUE TO '++' ERROR, FIX ASAP, DO NOT IGNORE INCOMING CHANGE####


  @RequestMapping("/cppunit1vid")
  String cppunit1vid() {
      return "cppunit1vid";
  }
  @RequestMapping("/cpplessons")
  String cpplessons() {
      return "cpplessons";
  }
  @RequestMapping("/cppunit1nearpod")
  String cppunit1nearpod() {
      return "cppunit1nearpod";
  }
    @RequestMapping("/cppunit1activity")
  String cppunit1activity() {
      return "cppunit1activity";
  }
   @RequestMapping("/cppunit1assessment")
  String cppunit1assessment() {
      return "cppunit1assessment";
  }
  @RequestMapping("/cppunit1feedback")
  String cppunit1feedback() {
      return "cppunit1feedback";
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
   @RequestMapping("/finance1unit1assessment")
  String finance1unit1assessment() {
      return "finance1unit1assessment";
  }
   @RequestMapping("/finance1unit1activity")
  String finance1unit1activity() {
      return "finance1unit1activity";
  }
@RequestMapping("/javalessons")
    String javalessons() {
        return "javalessons";
    }
@RequestMapping("/java1unit1activity")
    String java1unit1activity() {
        return "java1unit1activity";
    }
@RequestMapping("/java1unit1nearpod")
    String java1unit1nearpod() {
        return "java1unit1nearpod";
    }
@RequestMapping("/java1unit1assessment")
    String java1unit1assessment() {
        return "java1unit1assessment";
    }
@RequestMapping("/java1unit1feedback")
    String java1unit1feedback() {
        return "java1unit1feedback";
    }
@RequestMapping("/java1unit1reflection")
    String java1unit1reflection() {
        return "java1unit1reflection";
    }
@RequestMapping("/java1unit1vid")
    String java1unit1vid() {
        return "java1unit1vid";
        
    }
@RequestMapping("/java2unit2activity")
    String java2unit2activity() {
        return "java2unit2activity";
    }
@RequestMapping("/java2unit2assessment")
    String java2unit2nearpod() {
        return "java2unit2nearpod";
    }
@RequestMapping("/java2unit2feedback")
    String java2unit2feedback() {
        return "java2unit2feedback";
    }
@RequestMapping("/java2unit2reflection")
    String java2unit2reflection() {
        return "java2unit2reflection";
    }
@RequestMapping("/java2unit2vid")
    String java2unit2vid() {
        return "java2unit2vid";
    }
    
   @RequestMapping("/mathlessons")
  String mathlessons() {
      return "mathlessons";
  }
    @RequestMapping("/math1unit1vid")
  String math1unit1vid() {
      return "math1unit1vid";
  }
    @RequestMapping("/math1unit1nearpod")
  String math1unit1nearpod() {
      return "math1unit1nearpod";
  }
    @RequestMapping("/math1unit1activity")
  String math1unit1activity() {
      return "math1unit1activity";
  }
     @RequestMapping("/math1unit1assessment")
  String  math1unit1assessment() {
      return "math1unit1assessment";
  }
     @RequestMapping("/math1unit1feedback")
  String  math1unit1feedback() {
      return "math1unit1feedback";
  }
    @RequestMapping("/pythonlessons")
  String  pythonlessons() {
      return "pythonlessons";
  }
     @RequestMapping("/python1unit1vid")
  String  python1unit1vid() {
      return "python1unit1vid";
  }
    @RequestMapping("/python1unit1nearpod")
  String  python1unit1nearpod() {
      return "python1unit1nearpod";
  }
     @RequestMapping("/python1unit1activity")
  String  python1unit1activity() {
      return "python1unit1activity";
  }
     @RequestMapping("/python1unit1assessment")
  String  python1unit1assessment() {
      return "python1unit1assessment";
  }
    @RequestMapping("/python1unit1feedback")
  String  python1unit1feedback() {
      return "python1unit1feedback";
  }

@RequestMapping("/java3unit3activity")
    String java3unit3activity() {
        return "java3unit3activity";
    }
@RequestMapping("/java3unit3assessment")
    String java3unit3assessment() {
        return "java3unit3assessment";
    }
@RequestMapping("/java3unit3feedback")
    String java3unit3feedback() {
        return "java3unit3feedback";
    }
@RequestMapping("/java3unit3nearpod")
    String java3unit3nearpod() {
        return "java3unit3nearpod";
    }
@RequestMapping("/java3unit3reflection")
    String java3unit3reflection() {
        return "java3unit3reflection";
    }
@RequestMapping("/java3unit3vid")
    String java3unit3vid() {
        return "java3unit3vid";
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
