import os
import nbconvert
import nbformat


def notebook_paths():
    acc = []
    for dir in os.listdir():
            if dir[2] == "_":
                acc.append(dir + "/" +dir[3:] + ".ipynb")
    acc.sort()
    return acc[1:]


def combine_notebooks(notebook_paths):
     final_notebook = nbformat.v4.new_notebook()
     for path in notebook_paths:
          final_notebook.cells = final_notebook.cells + nbformat.read(path,4).cells
     print("Hello")
     nbformat.write(final_notebook, 'merged_notebook.ipynb')


nb_paths = notebook_paths()
combine_notebooks(nb_paths)
#first_notebook=nbformat.read('notebook1.ipynb', 4)
#final_notebook = nbformat.v4.new_notebook(metadata=first_notebook.metadata)

