<template>
    <div class="myBooks">
      <h1>My Books</h1>
      <ReadingList />
  
    </div>
    <router-link v-bind:to="{name: 'NewBook'}">Add Book To Reading List</router-link>&nbsp;|
  </template>
  
  <script>
  
  import ReadingList from '../components/ReadingList.vue';
  
  export default {
      components: {
        ReadingList
      }
  
  }
  </script>
  
  <style>
  
  </style>