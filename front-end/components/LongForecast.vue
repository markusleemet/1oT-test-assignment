<template lang="pug">
  #long-forecast-component.custom-section
    b-container
      h2.section-heading Long forecast
      .day-forecast(v-for="forecast in weatherForecast.forecast")
        b-button(v-b-toggle="`${forecast.date}`") {{ forecast.date }}
        b-collapse(:id="forecast.date")
          b-row(align-h="center")
            b-col.custom-column(cols="12" sm="6" lg="4")
              day(:phenomenon="forecast.day.phenomenon" :temp-max="forecast.day.tempMax" :description="forecast.day.text" :day="true")
            b-col.custom-column(cols="12" sm="6" lg="4")
              day(:phenomenon="forecast.night.phenomenon" :temp-max="forecast.night.tempMax" :description="forecast.night.text" :day="false")
</template>

<script lang="js">
import Day from './Day'

export default {
  name: 'LongForecast',
  components: { Day },
  props: {
    weatherForecast: {
      type: Object,
      default: () => {
      }
    }
  }
}
</script>

<style lang="scss">
#long-forecast-component {
  .day-forecast {
    display: flex;
    flex-flow: column nowrap;
  }
}
</style>
