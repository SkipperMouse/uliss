plugins {
	id("io.uliss.kotlin-conventions")
}

version = "0.0.1"

dependencies {
	implementation(project(":exception"))
	implementation("org.springframework.boot:spring-boot-starter-validation")
}