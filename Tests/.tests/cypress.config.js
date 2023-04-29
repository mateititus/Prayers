module.exports = {
  video: false,
  viewportWidth: 1280,
  viewportHeight: 720,
  screenshotOnRunFailure: true,
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    experimentalRunAllSpecs: true,
    baseUrl: "http://localhost:2525/Prayers",
  },
};
