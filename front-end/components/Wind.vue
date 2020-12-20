<template lang="pug">
  .wind-component.custom-card
    h4.card-heading {{ windDay.name }}
    b-img.custom-icon.mx-auto(src="~assets/icon/wind.svg")
    hr
    p
      span Direction:
      |  {{ windDay.direction }}
    p
      span Min speed:
      |  {{ windDay.speedMin }} m/s
    p
      span Min speed:
      |  {{ windDay.speedMax }} m/s
    p
      span Gust:
      |  {{ windDay.gust }}
    p
      span Direction:
      |  {{ windNight.direction }}
    p
      span Min speed:
      |  {{ windNight.speedMin }} m/s
    p
      span Min speed:
      |  {{ windNight.speedMax }} m/s
    p
      span Gust:
      |  {{ windNight.gust }}
</template>

<script lang="js">
export default {
  name: 'Wind',
  props: {
    windDay: {
      type: Object,
      default: () => {}
    },
    windNight: {
      type: Object,
      default: () => {}
    }
  }
}
</script>

<style lang="scss">
.wind-component {}
</style>
