import { definePlugin } from "@halo-dev/console-shared";
import HomeView from "./views/HomeView.vue";
import { IconPlug } from "@halo-dev/components";
import { markRaw } from "vue";

export default definePlugin({
  components: {},
  routes: [
    {
      parentName: "Root",
      route: {
        path: "/example",
        name: "Example",
        component: HomeView,
        meta: {
          title: "Code Injection Tool",
          searchable: true,
          menu: {
            name: "Code Injection Tool",
            group: "工具",
            icon: markRaw(IconPlug),
            priority: 0,
          },
        },
      },
    },
  ],
  extensionPoints: {},
});
