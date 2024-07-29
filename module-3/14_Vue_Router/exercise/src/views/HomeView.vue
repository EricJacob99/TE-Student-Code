<template>
    <div class="Home">
      <h1>Home</h1>
      <BestSellerList />
      <NewReleasesList />
  
    </div>
  </template>
  
  <script>
  
  import BestSellerList from '../components/BestSellerList.vue';
  import NewReleasesList from '../components/NewReleasesList.vue';

  
  export default {
      components: {
        BestSellerList,
        NewReleasesList
      }
  
  }
  </script>
  
  <style>
  
  </style>