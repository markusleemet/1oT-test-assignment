<template lang="pug">
.location-component.custom-card
  h4.card-heading {{ placeDay.name }}
  hr
  font-awesome-icon.custom-icon(:icon="['fas', 'sun']")
  p
    span Phenomenon:
    |  {{ placeDay.phenomenon }}
  p
    span Max temperature:
    |  {{ placeDay.tempMax }}°C
  hr.my-2
  font-awesome-icon.custom-icon(:icon="['fas', 'moon']")
  p
    span Phenomenon:
    |  {{ placeNight.phenomenon }}
  p
    span Min temperature:
    |  {{ placeNight.tempMin }}°C

</template>

<script lang="js">
export default {
  name: 'Location',
  props: {
    placeDay: {
      type: Object,
      default: () => {}
    },
    placeNight: {
      type: Object,
      default: () => {}
    }
  }
}
</script>

<style lang="scss">
.location-component{}
</style>
