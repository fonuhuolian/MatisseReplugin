

# MatisseReplugin

查看 [Matisse官方使用说明](https://github.com/zhihu/Matisse)


## 说明

最新项目使用了Replugin,Matisse闪退，是因为Matisse提供的Activity没有继承Replugin的Activity的问题，分享出来供使用插件化的小伙伴继续使用Matisse

宿主包使用官方的集成
插件包使用此集成

> 添加依赖

`root build.gradle `
```
allprojects {
    repositories {
        ...
        maven {
            url 'https://jitpack.io'
        }
    }
}
```
`module build.gradle `
```
implementation 'com.github.fonuhuolian:MatisseReplugin:1.0.0'
```

## Thanks
感谢 [Matisse](https://github.com/zhihu/Matisse)
