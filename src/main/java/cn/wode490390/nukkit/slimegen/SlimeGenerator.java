package cn.wode490390.nukkit.slimegen;

import cn.nukkit.block.Block;
import cn.nukkit.level.format.generic.BaseFullChunk;
import cn.nukkit.level.generator.Normal;

import java.util.Collections;
import java.util.Map;

public class SlimeGenerator extends Normal {

    public SlimeGenerator() {
        this(Collections.emptyMap());
    }

    public SlimeGenerator(Map<String, Object> options) {
        super(options);
    }

    @Override
    public void populateChunk(int chunkX, int chunkZ) {
        super.populateChunk(chunkX, chunkZ);
        BaseFullChunk chunk = this.getChunkManager().getChunk(chunkX, chunkZ);

        for (int x = 0; x < 16; ++x) {
            for (int z = 0; z < 16; ++z) {
                int baseY = chunk.getHighestBlockAt(x, z);
                for (int i = 0; i < 10; ++i) {
                    int y = baseY + i;
                    if (y < 256) {
                        chunk.setBlock(x, y, z, Block.SLIME_BLOCK);
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
