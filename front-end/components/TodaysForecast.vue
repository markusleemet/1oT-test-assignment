<template lang="pug">
  b-container.today-forecast-component.custom-section
    h2.section-heading Today forecast
    h3.section-heading General
    b-row.mb-5
      b-col.location-column(v-for="(place, index) in todaysForecast.day.place" key="index" cols="12" sm="6" lg="4")
        Location(:placeDay="todaysForecast.day.place[index]" :placeNight="todaysForecast.night.place[index]")
    h3.section-heading Wind
    b-row.mb-5
      b-col(v-for="(wind, index) in todaysForecast.day.wind" key="index" cols="12" sm="6" lg="4")
        Wind(:windDay="todaysForecast.day.wind[index]" :windNight="todaysForecast.night.wind[index]")
    h3.section-heading Water
    water(:seaDay="todaysForecast.day.sea" :seaNight="todaysForecast.night.sea" :peipsiDay="todaysForecast.day.peipsi" :peipsiNight="todaysForecast.night.peipsi")
</template>

<script lang="js">
import Location from './Location'
import Wind from './Wind'
import Water from './Water'

export default {
  name: 'TodaysForecast',
  components: {
    Water,
    Wind,
    Location
  },
  props: {
    todaysForecast: {
      type: Array,
      default: () => []
    }
  }
}
</script>

<style lang="scss">
.today-forecast-component {
}
</style>
