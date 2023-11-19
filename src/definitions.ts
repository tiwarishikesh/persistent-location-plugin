export interface PersistentLocationPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
