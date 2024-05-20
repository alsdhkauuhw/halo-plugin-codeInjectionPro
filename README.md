# halo-plugin-codeInjectionPro

Halo 开源建站工具默认提供了全局的代码注入功能，可以在所有页面或文章页面的头部和尾部注入特定的代码.  
该项目希望可以通过一个附加插件完成更加细致、灵活的代码注入管理，用户可以添加管理多个代码片段，并单独控制每个代码片段生效的页面、生效时间等。

如果您在使用本插件的过程中发现了BUG或新的建议，欢迎您在 [Github ISSUE](https://github.com/alsdhkauuhw/halo-plugin-codeInjectionPro/issues/new) 中提出

## ✨特性

- 提供代码注入管理列表，实现要注入的代码片段的增删改查及启用、禁用等基本功能
- 代码片段至少包含以下信息：名称，描述，代码内容（HTML 代码内容），代码位置（头部或尾部），需要注入的页面（可以通过特定的规则匹配多个页面），是否启用
- 支持大纲、数学公式、脑图、图表、流程图、甘特图、时序图、五线谱、多媒体、语音阅读、标题锚点、代码高亮及复制、graphviz 渲染、plantumlUML图
- 用户访问特定的页面时，可以检测到匹配该页面路径的所有启用的代码片段，并自动注入到最终返回的 HTML 页面中

## 💻使用方式

## 🤖兼容性

## 🏗开发日志

## 🧑‍💻开发环境

插件开发的详细文档请查阅：<https://docs.halo.run/developer-guide/plugin/hello-world>

```bash
git clone git@github.com:justice2001/vditor-mde.git

# 或者当你 fork 之后

git clone git@github.com:{your_github_id}/vditor-mde.git
```

```bash
cd path/to/plugin-starter
```

```bash
# 下载依赖包

# macOS/Linux执行:
chmod a+x download_dist.sh
./download_dist.sh

# Windows
# 要求安装7Zip并将7Zip的文件夹加入Path环境变量
./download_dist.bat
```



```bash
# macOS / Linux
./gradlew pnpmInstall

# Windows
./gradlew.bat pnpmInstall
```

```bash
# macOS / Linux
./gradlew build

# Windows
./gradlew.bat build
```

修改 Halo 配置文件：

```yaml
halo:
  plugin:
    runtime-mode: development
    fixedPluginPath:
      - "/path/to/plugin-starter"
```

## 🧑‍💼发布

## 📄参考文档

- [Halo官方文档](https://docs.halo.run)
- [主题端 HTML Head 标签处理](https://docs.halo.run/developer-guide/plugin/api-reference/server/extension-points/template-head-processor/)
- [java反应式编程](https://projectreactor.io/docs/core/release/reference/#intro-reactive)
