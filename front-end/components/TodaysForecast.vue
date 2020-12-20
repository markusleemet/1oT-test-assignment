<template lang="pug">
  b-container.today-forecast-component.custom-section
    h2.section-heading Today forecast
    b-row
      b-col.location-column(v-for="(place, index) in todaysForecast.day.place" key="index" cols="12" sm="6" lg="4")
        Location(:placeDay="todaysForecast.day.place[index]" :placeNight="todaysForecast.night.place[index]")
    b-row
      b-col(v-for="(wind, index) in todaysForecast.day.wind" key="index" cols="12" sm="6" lg="4")
        Wind(:windDay="todaysForecast.day.wind[index]" :windNight="todaysForecast.night.wind[index]")
</template>

<script lang="js">
import Location from './Location'
import Wind from './Wind'

export default {
  name: 'TodaysForecast',
  components: { Wind, Location },
  props: {
    todaysForecast: {
      type: Array,
      default: () => []
    }
  }
}
</script>

<style lang="scss">
.today-forecast-component {}
</style>
