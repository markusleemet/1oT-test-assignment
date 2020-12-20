<template lang="pug">
  .day-component.custom-card
    b-img.custom-icon.mx-auto(src="~assets/icon/day.svg" v-if="day")
    b-img.custom-icon.mx-auto(src="~assets/icon/night.svg" v-else)
    p
      span Phenomenon:
      |  {{ phenomenon }}
    p
      span Max temperature:
      |  {{ tempMax }}
    p {{ description }}
</template>

<script lang="js">
export default {
  name: 'Day',
  props: {
    tempMax: {
      type: Number,
      default: 0
    },
    description: {
      type: String,
      default: ''
    },
    phenomenon: {
      type: String,
      default: ''
    },
    day: {
      type: Boolean,
      default: true
    }
  }
}
</script>

<style lang="scss">
.day-component {
  display: flex;
  flex-flow: column nowrap;
  border: 1px solid black;
  background: linear-gradient(0deg, rgba(255, 0, 150, 0.3), rgba(255, 0, 150, 0.3)), url("~assets/day.jpg");
  background-size: cover;
  margin: 1rem;
}
</style>
