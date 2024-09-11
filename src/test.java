public class test {


    // Acompany is designing the class hierarchy for various cache implementations
    public class Cache {}

    public class DiskCache extends Cache {}

    public class MemoryCache extends Cache {}

    public class OptimizedDiskCache extends DiskCache {}


   // Select all the answers that will result in a runtime exception
    // Select all acceptable answers

    OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
    Cache cache = (Cache) optimizedDiskCache;


    MemoryCache memoryCache = new MemoryCache();
    Cache cache = (Cache) memoryCache;
    DiskCache diskCache = (DiskCache) cache;


    DiskCache diskCache = new DiskCache();
    OptimizedDiskCache optimizedDiskCache = (OptimizedDiskCache) diskCache;


    OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
    DiskCache diskCache = (DiskCache) optimizedDiskCache;


    Cache cache = new Cache();
    MemoryCache memoryCache = (MemoryCache) cache;


    OptimizedDiskCache optimizedDiskCache = new OptimizedDiskCache();
    Cache cache = (Cache) optimizedDiskCache;
    DiskCache diskCache = (DiskCache) cache;

}
