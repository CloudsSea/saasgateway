#language: zh-CN
#"zh-CN": {
#    "but": "*|但是<",
#    "and": "*|而且<|并且<|同时<",
#    "then": "*|那么<",
#    "when": "*|当<",
#    "name": "Chinese simplified",
#    "native": "简体中文",
#    "feature": "功能",
#    "background": "背景",
#    "scenario": "场景|剧本",
#    "scenario_outline": "场景大纲|剧本大纲",
#    "examples": "例子",
#    "given": "*|假如<|假设<|假定<"
#  }
 
@login
功能:假如我在登录系统，如果我登录成功并且输入的密码正确，那么就显示成功
	场景:登录
		假如:我以"saas"登录
		并且:输入的密码为"123456"
		那么:显示为"success"