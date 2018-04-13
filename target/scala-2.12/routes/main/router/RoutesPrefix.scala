// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/dmarenco/devops-course/corsoByDani/app/ls/conf/routes
// @DATE:Thu Apr 12 16:43:11 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
