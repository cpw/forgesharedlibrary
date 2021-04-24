def call(String properties = "properties") {
    data = sh(returnStdout: true, script: './gradlew ${properties} -q')
    props = [:]
    data.splitEachLine { props[it[0]] = it[1]}
    return props.get("version", "Missing")
}