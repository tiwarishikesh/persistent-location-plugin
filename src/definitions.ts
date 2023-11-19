declare module "@capacitor/core"{
  interface PluginRegistry{
    persistantLocationPlugin : PersistentLocationPlugin
  }
}


export interface PersistentLocationPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
