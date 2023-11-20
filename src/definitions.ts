declare module "@capacitor/core"{
  interface PluginRegistry{
    persistantLocationPlugin : PersistentLocationPlugin
  }
}


export interface PersistentLocationPlugin {
  start(options: { value: string }): Promise<{ value: string }>;
  stop(options: { value: string }): Promise<{ value: string }>;
}
