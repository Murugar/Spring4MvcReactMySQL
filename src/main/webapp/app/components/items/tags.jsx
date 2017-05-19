import React from 'react';
import Tag from './tag';

const Tags = React.createClass({
  render() {
    const { data } = this.props;

    if (!data[0].name) {
      return (<div className="tags text-primary"></div>);
    }

    return (
            <div className="panel panel-primary">
            
            <div className="panel-heading">Questions List</div>
            
            <div className="panel-body">       
      <div className="tags text-primary">
        {data.map((item, index) => 
          <span key={index}>
            <Tag data={item} />
          </span>
        )}
      </div>
      </div>
      </div>
    );
  }
});

export default Tags;
