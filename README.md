xls2csv
=======

Convert .xls and .xlsx files to csv using Apache POI.

This is a simple wrapper around the basic implementations of both `.xls` and `.xlsx` parsing with a few fixes for off cases thrown in.

As it stands, it will take multiple sheets and append them to the same file, making what's technically an invalid file. 

Also, the packaging process will include all of the POI schemas, so tends to end up far larger than you'd expect.

Compiling and Installing
========================

It uses scala's SBT build system, which you can install from [their download page](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html). Once that's done, run

    sbt one-jar

Then copy the file from `target/scala-2.9.1/xlsx2csv_2.9.1-0.1.0-one-jar.jar` to somewhere in your path.
    

Example usage
=============

    java -jar xls2csv.jar /path/to/xls-or-xlsx /path/to/csv-output