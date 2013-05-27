//
// Copyright 2012 Damian Helme
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
// 
// 

name := "Xlsx2Csv"

version := "0.1.0"

scalaVersion := "2.9.1"

organization := "uk.co.barrigan"

libraryDependencies ++= {
  	Seq(
    		"org.apache.poi" % "poi" % "3.8",
            "org.apache.poi" % "poi-ooxml" % "3.8",
            "org.apache.poi" % "ooxml-schemas" % "1.1"
  	)
}

resolvers ++= Seq("snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases"
                )
 
scalacOptions ++= Seq("-unchecked", "-deprecation")


seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)