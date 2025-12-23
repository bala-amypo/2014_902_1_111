package com.example.demo.service.impl;

import com.example.demo.model.MatchAttemptRecord;
import com.example.demo.service.MatchAttemptService;
import org.springframework.stereotype.Service;

@Service
public class MatchAttemptServiceImpl implements MatchAttemptService {

    @Override
    public MatchAttemptRecord logMatchAttempt(MatchAttemptRecord record) {
        System.out.println(
            "Match attempt: " +
            record.getStudentAId() + " & " + record mvn clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:3.3.2:clean (default-clean) @ demo ---
[INFO] Deleting /home/coder/Workspace/demo/target
[INFO] 
[INFO] --- maven-resources-plugin:3.3.1:resources (default-resources) @ demo ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- maven-compiler-plugin:3.13.0:compile (default-compile) @ demo ---
[INFO] Recompiling the module because of changed source code.
[INFO] Compiling 31 source files with javac [debug parameters release 17] to target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/config/SwaggerConfig.java:[8,8] class OpenApiConfig is public, should be declared in a file named OpenApiConfig.java
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[4,33] package com.example.demo.security does not exist
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[12,44] cannot find symbol
  symbol:   class AuthRequest
  location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[12,12] cannot find symbol
  symbol:   class AuthResponse
  location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[17,41] cannot find symbol
  symbol:   class AuthRequest
  location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[3,1] package com.example.demo.dto does not exist
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/CompatibilityScoreServiceImpl.java:[9,55] interface expected here
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/HabitProfileServiceImpl.java:[8,49] interface expected here
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/RoomAssignmentServiceImpl.java:[8,51] interface expected here
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[13,20] cannot find symbol
  symbol:   class AuthResponse
  location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[13,33] cannot find symbol
  symbol:   variable JwtUtil
  location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/StudentController.java:[21,30] cannot find symbol
  symbol:   method addStudent(com.example.demo.model.StudentProfile)
  location: variable studentService of type com.example.demo.service.StudentProfileService
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/StudentController.java:[31,30] cannot find symbol
  symbol:   method updateStudent(java.lang.Long,com.example.demo.model.StudentProfile)
  location: variable studentService of type com.example.demo.service.StudentProfileService
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/CompatibilityScoreServiceImpl.java:[11,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/HabitProfileServiceImpl.java:[10,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/MatchAttemptServiceImpl.java:[14,19] cannot find symbol
  symbol:   method getStudentAId()
  location: variable record of type com.example.demo.model.MatchAttemptRecord
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/MatchAttemptServiceImpl.java:[14,52] cannot find symbol
  symbol:   method getStudentBId()
  location: variable record of type com.example.demo.model.MatchAttemptRecord
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/RoomAssignmentServiceImpl.java:[10,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[11,8] com.example.demo.service.impl.StudentProfileServiceImpl is not abstract and does not override abstract method getStudentById(java.lang.Long) in com.example.demo.service.StudentProfileService
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[15,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[27,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[40,5] method does not override or implement a method from a supertype
[INFO] 22 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  29.814 s
[INFO] Finished at: 2025-12-23T04:13:38Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (default-compile) on project demo: Compilation failure: Compilation failure: 
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/config/SwaggerConfig.java:[8,8] class OpenApiConfig is public, should be declared in a file named OpenApiConfig.java
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[4,33] package com.example.demo.security does not exist
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[12,44] cannot find symbol
[ERROR]   symbol:   class AuthRequest
[ERROR]   location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[12,12] cannot find symbol
[ERROR]   symbol:   class AuthResponse
[ERROR]   location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[17,41] cannot find symbol
[ERROR]   symbol:   class AuthRequest
[ERROR]   location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[3,1] package com.example.demo.dto does not exist
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/CompatibilityScoreServiceImpl.java:[9,55] interface expected here
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/HabitProfileServiceImpl.java:[8,49] interface expected here
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/RoomAssignmentServiceImpl.java:[8,51] interface expected here
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[13,20] cannot find symbol
[ERROR]   symbol:   class AuthResponse
[ERROR]   location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/AuthController.java:[13,33] cannot find symbol
[ERROR]   symbol:   variable JwtUtil
[ERROR]   location: class com.example.demo.controller.AuthController
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/StudentController.java:[21,30] cannot find symbol
[ERROR]   symbol:   method addStudent(com.example.demo.model.StudentProfile)
[ERROR]   location: variable studentService of type com.example.demo.service.StudentProfileService
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/controller/StudentController.java:[31,30] cannot find symbol
[ERROR]   symbol:   method updateStudent(java.lang.Long,com.example.demo.model.StudentProfile)
[ERROR]   location: variable studentService of type com.example.demo.service.StudentProfileService
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/CompatibilityScoreServiceImpl.java:[11,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/HabitProfileServiceImpl.java:[10,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/MatchAttemptServiceImpl.java:[14,19] cannot find symbol
[ERROR]   symbol:   method getStudentAId()
[ERROR]   location: variable record of type com.example.demo.model.MatchAttemptRecord
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/MatchAttemptServiceImpl.java:[14,52] cannot find symbol
[ERROR]   symbol:   method getStudentBId()
[ERROR]   location: variable record of type com.example.demo.model.MatchAttemptRecord
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/RoomAssignmentServiceImpl.java:[10,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[11,8] com.example.demo.service.impl.StudentProfileServiceImpl is not abstract and does not override abstract method getStudentById(java.lang.Long) in com.example.demo.service.StudentProfileService
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[15,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[27,5] method does not override or implement a method from a supertype
[ERROR] /home/coder/Workspace/demo/src/main/java/com/example/demo/service/impl/StudentProfileServiceImpl.java:[40,5] method does not override or implement a method from a supertype
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
coder@e921b1a80538:~
coder@e921b1a80538:~/Workspace/demo$ 
.getStudentBId()
        );
        return record;
    }
}
