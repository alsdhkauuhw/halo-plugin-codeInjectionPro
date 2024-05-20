package run.halo.starter;

import org.springframework.stereotype.Component;
import run.halo.app.plugin.BasePlugin;
import run.halo.app.plugin.PluginContext;
import run.halo.starter.model.CodeInjection;
import run.halo.app.extension.Scheme;
import run.halo.app.extension.SchemeManager;

/**
 * <p>Plugin main class to manage the lifecycle of the plugin.</p>
 * <p>This class must be public and have a public constructor.</p>
 * <p>Only one main class extending {@link BasePlugin} is allowed per plugin.</p>
 *
 * @author guqing
 * @since 1.0.0
 */
@Component
public class StarterPlugin extends BasePlugin {

    private final SchemeManager schemeManager;
    public StarterPlugin(PluginContext pluginContext, SchemeManager schemeManager) {
        super(pluginContext);
        this.schemeManager = schemeManager;
    }

    @Override
    public void start() {
        // 插件启动时注册自定义模型
        schemeManager.register(CodeInjection.class);
        System.out.println("插件启动成功！");
    }

    @Override
    public void stop() {
        // 插件停用时取消注册自定义模型
        Scheme todoScheme = schemeManager.get(CodeInjection.class);
        schemeManager.unregister(todoScheme);
        System.out.println("插件停止！");
    }
}
