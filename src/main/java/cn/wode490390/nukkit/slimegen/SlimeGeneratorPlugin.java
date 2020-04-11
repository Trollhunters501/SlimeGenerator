package cn.wode490390.nukkit.slimegen;

import cn.nukkit.level.generator.Generator;
import cn.nukkit.plugin.PluginBase;
import cn.wode490390.nukkit.slimegen.util.MetricsLite;

public class SlimeGeneratorPlugin extends PluginBase {

    @Override
    public void onEnable() {
        try {
            new MetricsLite(this, 7076);
        } catch (Throwable ignore) {

        }

        Generator.addGenerator(SlimeGenerator.class, "default", Generator.TYPE_INFINITE);
        Generator.addGenerator(SlimeGenerator.class, "normal", Generator.TYPE_INFINITE);
    }
}
