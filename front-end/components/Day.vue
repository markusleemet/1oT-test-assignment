<template lang="pug">
  .day-component.custom-card
    font-awesome-icon.custom-icon(:icon="['fas', 'sun']" v-if="day")
    font-awesome-icon.custom-icon(:icon="['fas', 'moon']" v-else)
    p
      span Phenomenon:
      |  {{ phenomenon }}
    p
      span(v-if="day") Max temperature:
      span(v-else) Min temperature:
      |  {{ tempMax }}°C
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
.day-component {}
</style>
