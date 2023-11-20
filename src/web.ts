import { WebPlugin } from '@capacitor/core';

import type { PersistentLocationPlugin } from './definitions';

export class PersistentLocationWeb extends WebPlugin implements PersistentLocationPlugin {
  async start(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }

  async stop(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
