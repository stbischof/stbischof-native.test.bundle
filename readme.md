
Download latest remote server jar:
`https://bndtools.jfrog.io/ui/native/libs-snapshot/biz/aQute/bnd/biz.aQute.remote.main/6.1.0-SNAPSHOT`

start remote server local:
`java -jar biz.aQute.remote.main.jar -e -t -a -p 29998`


this is the target where the native launcher should deploy the bundles


Run via Maven works
`mvn bnd-run:run`

IDE support is missing