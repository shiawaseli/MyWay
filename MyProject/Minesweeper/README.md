0.* 是功能未完成版

	0.1 完成了欢迎界面，实现键盘控制
	0.2 完成了设置界面，支持初级、中级、高级和自定义四种模式，自定义模式中可以设置高度、宽度和雷数（有限制）
	0.3 完成了扫雷的游戏环节，通过递归翻开草丛。
	当标记了正确的雷数之后，能够尽可能过的翻开草丛。
	还没有实现结束界面，当踩雷和雷全部标记好后也不会结束。

1.* 功能基本实现

	1.0 完成结束模块
	增加继续模块，能够继续上次游戏（只能继续程序开始后的上次游戏，程序重开后清空）
	1.1 增加存档功能
	修改继续模块，变为存档模板，能够自主保存游戏进度和进行上次退出的游戏，改为使用中文界面
	1.2 修改界面切换实现
	修改了游戏指令的功能以及部分函数的实现
	1.3 改变窗口属性
	使窗口大小适应游戏，修改后页面切换出现刷新过多的问题（缓冲区过小导致）
	1.4 鼠标操作
	能够通过鼠标进行游戏
	1.5 刷新问题
	修改了页面打印实现，解决频繁刷新的问题
	1.6 鼠标进行所有操作
	实现所有界面的鼠标控制，修改翻开草丛的内部实现
注意：
游戏所在目录下必须有 Save 文件夹 1.1 版才能打开游戏
游戏上级目录中必须有 Save 文件夹 1.2 和 1.3 版才能打开游戏