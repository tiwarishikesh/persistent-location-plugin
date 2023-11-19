import { registerPlugin } from '@capacitor/core';

import type { PersistentLocationPlugin } from './definitions';

const PersistentLocation = registerPlugin<PersistentLocationPlugin>('PersistentLocation', {
  web: () => import('./web').then(m => new m.PersistentLocationWeb()),
});

export * from './definitions';
export { PersistentLocation };
