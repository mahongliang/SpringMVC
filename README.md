# SpringMVC
SpringMVC学习模版

# 1. SpringMVC框架

# 2. controller编写

1. HttpServletRequest 接受jsp数据
2. Model接受jsp数据 数据绑定@RequestParam
3. Resetful格式url接受数据 数据绑定@PathVariable

# 3. 文件上传
<!--200*1024*1024即200M resolveLazily属性启用是为了推迟文件解析，以便捕获文件大小异常 -->
	<bean id="multipartResolver"
		class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
		<property name="maxUploadSize" value="209715200" />
		<property name="defaultEncoding" value="UTF-8" />
		<property name="resolveLazily" value="true" />
	</bean>
	
# 4.json格式返回数据
1. 配置ViewResolver
2. @ResponseBody标记返回格式
3. http://localhost:8080/SpringMVC/course_json.jsp?courseId=123格式通过js的ajax方式得到json格式对象，在显示数据
