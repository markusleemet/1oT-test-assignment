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
.location-component{
  background: rgb(255,250,167);
  background: linear-gradient(180deg, rgba(255,250,167,0.2) 24%, rgba(255,250,167,0.2) 45%, rgba(20,56,255,0.2) 60%, rgba(20,56,255,0.2) 100%);
  background-size: cover;
  background-position-y: center;
  flex-grow: 1;
  .card-heading{
    text-align: center;
    text-transform: uppercase;
    font-weight: 700;
    margin-top: .5rem;
    margin-bottom: .5rem;
  }
}
</style>
