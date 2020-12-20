<template lang="pug">
  b-jumbotron.hero-component
    b-container.custom-section
      template#header
        h1.section-heading.underlined-heading Weather app
      template#lead This website is test assignment for 1oT internship position.
        br
        |  It displays Estonian weather information.
      .my-5
      b-button(href="#" v-scroll-to="'.today-forecast-component'" variant="success")
        font-awesome-icon.my-auto.mr-2(:icon="['fas', 'calendar-day']")
        | Today's forecast
      br
      b-button(href="#" v-scroll-to="'#long-forecast-component'" variant="success")
        font-awesome-icon.my-auto.mr-2(:icon="['fas', 'calendar-alt']")
        | Long forecast

</template>

<script lang="js">
export default {
  name: 'Hero'
}
</script>

<style lang="scss">
.hero-component {
  background-image: url("~assets/hero-bg.jpg");
  background-size: cover;
  background-repeat: no-repeat;
  background-position-y: top;
  min-height: 100vh;
  border-radius: 0;
  font-weight: 700;
  h1{
    font-size: 4rem;
    text-align: left !important;
  }
  .btn{
    margin-top: .5rem;
    margin-bottom: .5rem;
    padding: 1rem;
    display:inline-flex;
    background-color: #407a56;
  }
  .custom-section{

  }
}
</style>
