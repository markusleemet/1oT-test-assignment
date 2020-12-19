<template lang="pug">
  b-container.today-forecast-component.custom-section
    h2.section-heading Today forecast
    b-row
      b-col.location-container(v-for="(place, index) in placesDay" key="place.name" cols="12" sm="6" lg="4")
        Location(:placeDay="placesDay[index]" :placeNight="placesNight[index]")
</template>

<script lang="js">
import Location from './Location'

export default {
  name: 'TodayForecast',
  components: { Location },
  props: {
    placesDay: {
      type: Array,
      default: () => []
    },
    placesNight: {
      type: Array,
      default: () => []
    }
  }
}
</script>

<style lang="scss">
.today-forecast-component {
  .location-container{
    display: flex;
    align-items: stretch;
  }
}
</style>
