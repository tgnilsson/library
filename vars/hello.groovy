#!groovy
def call(options) {
	sh 'echo Hello World'
//consider using camelCase for groovy and all caps for env
	dev results = sh(script:"echo ${options}", returnStdout:true).trim()
	echo "${results}"
	def varHere = "Something else"
	echo "${varHere}"
}