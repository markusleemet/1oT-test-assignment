<template lang="pug">
  .index-page
    Hero
</template>

<script lang="js">
import Hero from '../components/Hero'
export default {
  components: { Hero },
  async asyncData ({ $axios }) {
  },
  created () {
    this.$axios.$get(process.env.backendUrl + '/weather')
      .then(function (response) {
        // handle success
        console.log(response)
      })
      .catch(function (error) {
        // handle error
        console.log(process.env.backendUrl + '/weather')
        console.log(error)
      })
      .then(function () {
        console.log('finished')
      })
  }
}
</script>

<style lang="scss">
.index-page {
}
</style>
