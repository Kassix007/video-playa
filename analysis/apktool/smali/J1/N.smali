.class public final LJ1/N;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LB0/o;

.field public final b:LE/c0;

.field public final c:LJ1/q;

.field public d:Z

.field public e:I


# direct methods
.method public constructor <init>(LB0/o;LE/c0;LJ1/q;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LJ1/N;->d:Z

    const/4 v0, -0x1

    .line 3
    iput v0, p0, LJ1/N;->e:I

    .line 4
    iput-object p1, p0, LJ1/N;->a:LB0/o;

    .line 5
    iput-object p2, p0, LJ1/N;->b:LE/c0;

    .line 6
    iput-object p3, p0, LJ1/N;->c:LJ1/q;

    return-void
.end method

.method public constructor <init>(LB0/o;LE/c0;LJ1/q;LJ1/M;)V
    .locals 2

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 34
    iput-boolean v0, p0, LJ1/N;->d:Z

    const/4 v1, -0x1

    .line 35
    iput v1, p0, LJ1/N;->e:I

    .line 36
    iput-object p1, p0, LJ1/N;->a:LB0/o;

    .line 37
    iput-object p2, p0, LJ1/N;->b:LE/c0;

    .line 38
    iput-object p3, p0, LJ1/N;->c:LJ1/q;

    const/4 p1, 0x0

    .line 39
    iput-object p1, p3, LJ1/q;->s:Landroid/util/SparseArray;

    .line 40
    iput-object p1, p3, LJ1/q;->t:Landroid/os/Bundle;

    .line 41
    iput v0, p3, LJ1/q;->G:I

    .line 42
    iput-boolean v0, p3, LJ1/q;->D:Z

    .line 43
    iput-boolean v0, p3, LJ1/q;->A:Z

    .line 44
    iget-object p2, p3, LJ1/q;->w:LJ1/q;

    if-eqz p2, :cond_0

    iget-object p2, p2, LJ1/q;->u:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object p2, p1

    :goto_0
    iput-object p2, p3, LJ1/q;->x:Ljava/lang/String;

    .line 45
    iput-object p1, p3, LJ1/q;->w:LJ1/q;

    .line 46
    iget-object p1, p4, LJ1/M;->C:Landroid/os/Bundle;

    if-eqz p1, :cond_1

    .line 47
    iput-object p1, p3, LJ1/q;->r:Landroid/os/Bundle;

    return-void

    .line 48
    :cond_1
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p3, LJ1/q;->r:Landroid/os/Bundle;

    return-void
.end method

.method public constructor <init>(LB0/o;LE/c0;Ljava/lang/ClassLoader;LJ1/B;LJ1/M;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, LJ1/N;->d:Z

    const/4 v0, -0x1

    .line 9
    iput v0, p0, LJ1/N;->e:I

    .line 10
    iput-object p1, p0, LJ1/N;->a:LB0/o;

    .line 11
    iput-object p2, p0, LJ1/N;->b:LE/c0;

    .line 12
    iget-object p1, p5, LJ1/M;->q:Ljava/lang/String;

    invoke-virtual {p4, p1}, LJ1/B;->a(Ljava/lang/String;)LJ1/q;

    move-result-object p1

    .line 13
    iget-object p2, p5, LJ1/M;->z:Landroid/os/Bundle;

    if-eqz p2, :cond_0

    .line 14
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 15
    :cond_0
    invoke-virtual {p1, p2}, LJ1/q;->F(Landroid/os/Bundle;)V

    .line 16
    iget-object p2, p5, LJ1/M;->r:Ljava/lang/String;

    iput-object p2, p1, LJ1/q;->u:Ljava/lang/String;

    .line 17
    iget-boolean p2, p5, LJ1/M;->s:Z

    iput-boolean p2, p1, LJ1/q;->C:Z

    const/4 p2, 0x1

    .line 18
    iput-boolean p2, p1, LJ1/q;->E:Z

    .line 19
    iget p2, p5, LJ1/M;->t:I

    iput p2, p1, LJ1/q;->L:I

    .line 20
    iget p2, p5, LJ1/M;->u:I

    iput p2, p1, LJ1/q;->M:I

    .line 21
    iget-object p2, p5, LJ1/M;->v:Ljava/lang/String;

    iput-object p2, p1, LJ1/q;->N:Ljava/lang/String;

    .line 22
    iget-boolean p2, p5, LJ1/M;->w:Z

    iput-boolean p2, p1, LJ1/q;->Q:Z

    .line 23
    iget-boolean p2, p5, LJ1/M;->x:Z

    iput-boolean p2, p1, LJ1/q;->B:Z

    .line 24
    iget-boolean p2, p5, LJ1/M;->y:Z

    iput-boolean p2, p1, LJ1/q;->P:Z

    .line 25
    iget-boolean p2, p5, LJ1/M;->A:Z

    iput-boolean p2, p1, LJ1/q;->O:Z

    .line 26
    invoke-static {}, Landroidx/lifecycle/p;->values()[Landroidx/lifecycle/p;

    move-result-object p2

    iget p3, p5, LJ1/M;->B:I

    aget-object p2, p2, p3

    iput-object p2, p1, LJ1/q;->b0:Landroidx/lifecycle/p;

    .line 27
    iget-object p2, p5, LJ1/M;->C:Landroid/os/Bundle;

    if-eqz p2, :cond_1

    .line 28
    iput-object p2, p1, LJ1/q;->r:Landroid/os/Bundle;

    goto :goto_0

    .line 29
    :cond_1
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    iput-object p2, p1, LJ1/q;->r:Landroid/os/Bundle;

    .line 30
    :goto_0
    iput-object p1, p0, LJ1/N;->c:LJ1/q;

    const/4 p2, 0x2

    .line 31
    invoke-static {p2}, LJ1/H;->F(I)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 32
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Instantiated fragment "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FragmentManager"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, LJ1/N;->c:LJ1/q;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "moveto ACTIVITY_CREATED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v1, v3, LJ1/q;->r:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object v1, v3, LJ1/q;->J:LJ1/H;

    .line 32
    .line 33
    invoke-virtual {v1}, LJ1/H;->L()V

    .line 34
    .line 35
    .line 36
    iput v0, v3, LJ1/q;->q:I

    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-boolean v1, v3, LJ1/q;->S:Z

    .line 40
    .line 41
    invoke-virtual {v3}, LJ1/q;->p()V

    .line 42
    .line 43
    .line 44
    iget-boolean v4, v3, LJ1/q;->S:Z

    .line 45
    .line 46
    const-string v5, "Fragment "

    .line 47
    .line 48
    if-eqz v4, :cond_6

    .line 49
    .line 50
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v4, "moveto RESTORE_VIEW_STATE: "

    .line 59
    .line 60
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object v0, v3, LJ1/q;->U:Landroid/view/View;

    .line 74
    .line 75
    const/4 v2, 0x0

    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    iget-object v4, v3, LJ1/q;->r:Landroid/os/Bundle;

    .line 79
    .line 80
    iget-object v6, v3, LJ1/q;->s:Landroid/util/SparseArray;

    .line 81
    .line 82
    if-eqz v6, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0, v6}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 85
    .line 86
    .line 87
    iput-object v2, v3, LJ1/q;->s:Landroid/util/SparseArray;

    .line 88
    .line 89
    :cond_2
    iget-object v0, v3, LJ1/q;->U:Landroid/view/View;

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    iget-object v0, v3, LJ1/q;->d0:LJ1/P;

    .line 94
    .line 95
    iget-object v6, v3, LJ1/q;->t:Landroid/os/Bundle;

    .line 96
    .line 97
    iget-object v0, v0, LJ1/P;->u:LZ/m;

    .line 98
    .line 99
    invoke-virtual {v0, v6}, LZ/m;->z(Landroid/os/Bundle;)V

    .line 100
    .line 101
    .line 102
    iput-object v2, v3, LJ1/q;->t:Landroid/os/Bundle;

    .line 103
    .line 104
    :cond_3
    iput-boolean v1, v3, LJ1/q;->S:Z

    .line 105
    .line 106
    invoke-virtual {v3, v4}, LJ1/q;->A(Landroid/os/Bundle;)V

    .line 107
    .line 108
    .line 109
    iget-boolean v0, v3, LJ1/q;->S:Z

    .line 110
    .line 111
    if-eqz v0, :cond_4

    .line 112
    .line 113
    iget-object v0, v3, LJ1/q;->U:Landroid/view/View;

    .line 114
    .line 115
    if-eqz v0, :cond_5

    .line 116
    .line 117
    iget-object v0, v3, LJ1/q;->d0:LJ1/P;

    .line 118
    .line 119
    sget-object v4, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 120
    .line 121
    invoke-virtual {v0, v4}, LJ1/P;->c(Landroidx/lifecycle/o;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_4
    new-instance v0, LJ1/U;

    .line 126
    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    .line 128
    .line 129
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v2, " did not call through to super.onViewStateRestored()"

    .line 136
    .line 137
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0

    .line 148
    :cond_5
    :goto_0
    iput-object v2, v3, LJ1/q;->r:Landroid/os/Bundle;

    .line 149
    .line 150
    iget-object v0, v3, LJ1/q;->J:LJ1/H;

    .line 151
    .line 152
    iput-boolean v1, v0, LJ1/H;->E:Z

    .line 153
    .line 154
    iput-boolean v1, v0, LJ1/H;->F:Z

    .line 155
    .line 156
    iget-object v2, v0, LJ1/H;->L:LJ1/K;

    .line 157
    .line 158
    iput-boolean v1, v2, LJ1/K;->g:Z

    .line 159
    .line 160
    const/4 v2, 0x4

    .line 161
    invoke-virtual {v0, v2}, LJ1/H;->t(I)V

    .line 162
    .line 163
    .line 164
    iget-object v0, p0, LJ1/N;->a:LB0/o;

    .line 165
    .line 166
    invoke-virtual {v0, v1}, LB0/o;->o(Z)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_6
    new-instance v0, LJ1/U;

    .line 171
    .line 172
    new-instance v1, Ljava/lang/StringBuilder;

    .line 173
    .line 174
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    const-string v2, " did not call through to super.onActivityCreated()"

    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw v0
.end method

.method public final b()V
    .locals 8

    .line 1
    iget-object v0, p0, LJ1/N;->b:LE/c0;

    .line 2
    .line 3
    iget-object v0, v0, LE/c0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 8
    .line 9
    iget-object v2, v1, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    add-int/lit8 v5, v4, -0x1

    .line 20
    .line 21
    :goto_0
    if-ltz v5, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    check-cast v6, LJ1/q;

    .line 28
    .line 29
    iget-object v7, v6, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-ne v7, v2, :cond_1

    .line 32
    .line 33
    iget-object v6, v6, LJ1/q;->U:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    add-int/lit8 v3, v0, 0x1

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_1
    add-int/lit8 v5, v5, -0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-ge v4, v5, :cond_4

    .line 54
    .line 55
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, LJ1/q;

    .line 60
    .line 61
    iget-object v6, v5, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 62
    .line 63
    if-ne v6, v2, :cond_3

    .line 64
    .line 65
    iget-object v5, v5, LJ1/q;->U:Landroid/view/View;

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    goto :goto_1

    .line 75
    :cond_4
    :goto_2
    iget-object v0, v1, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 76
    .line 77
    iget-object v1, v1, LJ1/q;->U:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final c()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto ATTACHED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, LJ1/q;->w:LJ1/q;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const-string v3, " that does not belong to this FragmentManager!"

    .line 33
    .line 34
    const-string v4, " declared target fragment "

    .line 35
    .line 36
    iget-object v5, p0, LJ1/N;->b:LE/c0;

    .line 37
    .line 38
    const-string v6, "Fragment "

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v0, v0, LJ1/q;->u:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, v5, LE/c0;->r:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v5, Ljava/util/HashMap;

    .line 47
    .line 48
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, LJ1/N;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-object v3, v1, LJ1/q;->w:LJ1/q;

    .line 57
    .line 58
    iget-object v3, v3, LJ1/q;->u:Ljava/lang/String;

    .line 59
    .line 60
    iput-object v3, v1, LJ1/q;->x:Ljava/lang/String;

    .line 61
    .line 62
    iput-object v2, v1, LJ1/q;->w:LJ1/q;

    .line 63
    .line 64
    move-object v2, v0

    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    new-instance v2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object v1, v1, LJ1/q;->w:LJ1/q;

    .line 80
    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v0

    .line 95
    :cond_2
    iget-object v0, v1, LJ1/q;->x:Ljava/lang/String;

    .line 96
    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget-object v2, v5, LE/c0;->r:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v2, Ljava/util/HashMap;

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v2, v0

    .line 108
    check-cast v2, LJ1/N;

    .line 109
    .line 110
    if-eqz v2, :cond_3

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    new-instance v2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    iget-object v1, v1, LJ1/q;->x:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v2, v1, v3}, Lk1/i;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_4
    :goto_0
    if-eqz v2, :cond_5

    .line 137
    .line 138
    invoke-virtual {v2}, LJ1/N;->k()V

    .line 139
    .line 140
    .line 141
    :cond_5
    iget-object v0, v1, LJ1/q;->H:LJ1/H;

    .line 142
    .line 143
    iget-object v2, v0, LJ1/H;->t:LJ1/u;

    .line 144
    .line 145
    iput-object v2, v1, LJ1/q;->I:LJ1/u;

    .line 146
    .line 147
    iget-object v0, v0, LJ1/H;->v:LJ1/q;

    .line 148
    .line 149
    iput-object v0, v1, LJ1/q;->K:LJ1/q;

    .line 150
    .line 151
    iget-object v0, p0, LJ1/N;->a:LB0/o;

    .line 152
    .line 153
    const/4 v2, 0x0

    .line 154
    invoke-virtual {v0, v2}, LB0/o;->v(Z)V

    .line 155
    .line 156
    .line 157
    iget-object v3, v1, LJ1/q;->h0:Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    move v5, v2

    .line 164
    :goto_1
    if-ge v5, v4, :cond_6

    .line 165
    .line 166
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    add-int/lit8 v5, v5, 0x1

    .line 171
    .line 172
    check-cast v7, LJ1/n;

    .line 173
    .line 174
    iget-object v7, v7, LJ1/n;->a:LJ1/q;

    .line 175
    .line 176
    iget-object v8, v7, LJ1/q;->g0:LZ/m;

    .line 177
    .line 178
    iget-object v8, v8, LZ/m;->r:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v8, Li2/a;

    .line 181
    .line 182
    invoke-virtual {v8}, Li2/a;->a()V

    .line 183
    .line 184
    .line 185
    invoke-static {v7}, Landroidx/lifecycle/X;->c(Lg2/e;)V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 190
    .line 191
    .line 192
    iget-object v3, v1, LJ1/q;->J:LJ1/H;

    .line 193
    .line 194
    iget-object v4, v1, LJ1/q;->I:LJ1/u;

    .line 195
    .line 196
    invoke-virtual {v1}, LJ1/q;->c()LC3/a;

    .line 197
    .line 198
    .line 199
    move-result-object v5

    .line 200
    invoke-virtual {v3, v4, v5, v1}, LJ1/H;->b(LJ1/u;LC3/a;LJ1/q;)V

    .line 201
    .line 202
    .line 203
    iput v2, v1, LJ1/q;->q:I

    .line 204
    .line 205
    iput-boolean v2, v1, LJ1/q;->S:Z

    .line 206
    .line 207
    iget-object v3, v1, LJ1/q;->I:LJ1/u;

    .line 208
    .line 209
    iget-object v3, v3, LJ1/u;->u:Lh/h;

    .line 210
    .line 211
    invoke-virtual {v1, v3}, LJ1/q;->r(Landroid/content/Context;)V

    .line 212
    .line 213
    .line 214
    iget-boolean v3, v1, LJ1/q;->S:Z

    .line 215
    .line 216
    if-eqz v3, :cond_8

    .line 217
    .line 218
    iget-object v3, v1, LJ1/q;->H:LJ1/H;

    .line 219
    .line 220
    iget-object v3, v3, LJ1/H;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 227
    .line 228
    .line 229
    move-result v4

    .line 230
    if-eqz v4, :cond_7

    .line 231
    .line 232
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    check-cast v4, LJ1/L;

    .line 237
    .line 238
    invoke-interface {v4}, LJ1/L;->c()V

    .line 239
    .line 240
    .line 241
    goto :goto_2

    .line 242
    :cond_7
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 243
    .line 244
    iput-boolean v2, v1, LJ1/H;->E:Z

    .line 245
    .line 246
    iput-boolean v2, v1, LJ1/H;->F:Z

    .line 247
    .line 248
    iget-object v3, v1, LJ1/H;->L:LJ1/K;

    .line 249
    .line 250
    iput-boolean v2, v3, LJ1/K;->g:Z

    .line 251
    .line 252
    invoke-virtual {v1, v2}, LJ1/H;->t(I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, v2}, LB0/o;->q(Z)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_8
    new-instance v0, LJ1/U;

    .line 260
    .line 261
    new-instance v2, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string v1, " did not call through to super.onAttach()"

    .line 270
    .line 271
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw v0
.end method

.method public final d()I
    .locals 14

    .line 1
    iget-object v0, p0, LJ1/N;->c:LJ1/q;

    .line 2
    .line 3
    iget-object v1, v0, LJ1/q;->H:LJ1/H;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget v0, v0, LJ1/q;->q:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v1, p0, LJ1/N;->e:I

    .line 11
    .line 12
    iget-object v2, v0, LJ1/q;->b0:Landroidx/lifecycle/p;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x5

    .line 20
    const/4 v5, -0x1

    .line 21
    const/4 v6, 0x3

    .line 22
    const/4 v7, 0x4

    .line 23
    const/4 v8, 0x2

    .line 24
    const/4 v9, 0x1

    .line 25
    if-eq v2, v9, :cond_3

    .line 26
    .line 27
    if-eq v2, v8, :cond_2

    .line 28
    .line 29
    if-eq v2, v6, :cond_1

    .line 30
    .line 31
    if-eq v2, v7, :cond_4

    .line 32
    .line 33
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :cond_4
    :goto_0
    iget-boolean v2, v0, LJ1/q;->C:Z

    .line 53
    .line 54
    if-eqz v2, :cond_7

    .line 55
    .line 56
    iget-boolean v2, v0, LJ1/q;->D:Z

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    iget v1, p0, LJ1/N;->e:I

    .line 61
    .line 62
    invoke-static {v1, v8}, Ljava/lang/Math;->max(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 67
    .line 68
    if-eqz v2, :cond_7

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-nez v2, :cond_7

    .line 75
    .line 76
    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    goto :goto_1

    .line 81
    :cond_5
    iget v2, p0, LJ1/N;->e:I

    .line 82
    .line 83
    if-ge v2, v7, :cond_6

    .line 84
    .line 85
    iget v2, v0, LJ1/q;->q:I

    .line 86
    .line 87
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    goto :goto_1

    .line 92
    :cond_6
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    :cond_7
    :goto_1
    iget-boolean v2, v0, LJ1/q;->A:Z

    .line 97
    .line 98
    if-nez v2, :cond_8

    .line 99
    .line 100
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    :cond_8
    iget-object v2, v0, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-eqz v2, :cond_e

    .line 107
    .line 108
    invoke-virtual {v0}, LJ1/q;->k()LJ1/H;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-virtual {v10}, LJ1/H;->D()Lx3/k;

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-static {v2, v10}, LJ1/h;->f(Landroid/view/ViewGroup;Lx3/k;)LJ1/h;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v0}, LJ1/h;->d(LJ1/q;)LJ1/T;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    if-eqz v10, :cond_9

    .line 128
    .line 129
    iget v10, v10, LJ1/T;->b:I

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_9
    move v10, v3

    .line 133
    :goto_2
    iget-object v2, v2, LJ1/h;->c:Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    :cond_a
    if-ge v3, v11, :cond_b

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    add-int/lit8 v3, v3, 0x1

    .line 146
    .line 147
    check-cast v12, LJ1/T;

    .line 148
    .line 149
    iget-object v13, v12, LJ1/T;->c:LJ1/q;

    .line 150
    .line 151
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_a

    .line 156
    .line 157
    iget-boolean v13, v12, LJ1/T;->f:Z

    .line 158
    .line 159
    if-nez v13, :cond_a

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_b
    const/4 v12, 0x0

    .line 163
    :goto_3
    if-eqz v12, :cond_d

    .line 164
    .line 165
    if-eqz v10, :cond_c

    .line 166
    .line 167
    if-ne v10, v9, :cond_d

    .line 168
    .line 169
    :cond_c
    iget v2, v12, LJ1/T;->b:I

    .line 170
    .line 171
    move v3, v2

    .line 172
    goto :goto_4

    .line 173
    :cond_d
    move v3, v10

    .line 174
    :cond_e
    :goto_4
    if-ne v3, v8, :cond_f

    .line 175
    .line 176
    const/4 v2, 0x6

    .line 177
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    goto :goto_5

    .line 182
    :cond_f
    if-ne v3, v6, :cond_10

    .line 183
    .line 184
    invoke-static {v1, v6}, Ljava/lang/Math;->max(II)I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    goto :goto_5

    .line 189
    :cond_10
    iget-boolean v2, v0, LJ1/q;->B:Z

    .line 190
    .line 191
    if-eqz v2, :cond_12

    .line 192
    .line 193
    invoke-virtual {v0}, LJ1/q;->o()Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_11

    .line 198
    .line 199
    invoke-static {v1, v9}, Ljava/lang/Math;->min(II)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    goto :goto_5

    .line 204
    :cond_11
    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    :cond_12
    :goto_5
    iget-boolean v2, v0, LJ1/q;->V:Z

    .line 209
    .line 210
    if-eqz v2, :cond_13

    .line 211
    .line 212
    iget v2, v0, LJ1/q;->q:I

    .line 213
    .line 214
    if-ge v2, v4, :cond_13

    .line 215
    .line 216
    invoke-static {v1, v7}, Ljava/lang/Math;->min(II)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    :cond_13
    invoke-static {v8}, LJ1/H;->F(I)Z

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-eqz v2, :cond_14

    .line 225
    .line 226
    new-instance v2, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v3, "computeExpectedState() of "

    .line 229
    .line 230
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    const-string v3, " for "

    .line 237
    .line 238
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v2, "FragmentManager"

    .line 249
    .line 250
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    :cond_14
    return v1
.end method

.method public final e()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v0, v1, LJ1/q;->Z:Z

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    iget-object v0, p0, LJ1/N;->a:LB0/o;

    .line 36
    .line 37
    invoke-virtual {v0, v3}, LB0/o;->w(Z)V

    .line 38
    .line 39
    .line 40
    iget-object v4, v1, LJ1/q;->r:Landroid/os/Bundle;

    .line 41
    .line 42
    iget-object v5, v1, LJ1/q;->J:LJ1/H;

    .line 43
    .line 44
    invoke-virtual {v5}, LJ1/H;->L()V

    .line 45
    .line 46
    .line 47
    iput v2, v1, LJ1/q;->q:I

    .line 48
    .line 49
    iput-boolean v3, v1, LJ1/q;->S:Z

    .line 50
    .line 51
    iget-object v5, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 52
    .line 53
    new-instance v6, Lg2/b;

    .line 54
    .line 55
    const/4 v7, 0x1

    .line 56
    invoke-direct {v6, v1, v7}, Lg2/b;-><init>(Lg2/e;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5, v6}, Landroidx/lifecycle/z;->a(Landroidx/lifecycle/w;)V

    .line 60
    .line 61
    .line 62
    iget-object v5, v1, LJ1/q;->g0:LZ/m;

    .line 63
    .line 64
    invoke-virtual {v5, v4}, LZ/m;->z(Landroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v4}, LJ1/q;->s(Landroid/os/Bundle;)V

    .line 68
    .line 69
    .line 70
    iput-boolean v2, v1, LJ1/q;->Z:Z

    .line 71
    .line 72
    iget-boolean v2, v1, LJ1/q;->S:Z

    .line 73
    .line 74
    if-eqz v2, :cond_1

    .line 75
    .line 76
    iget-object v1, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 77
    .line 78
    sget-object v2, Landroidx/lifecycle/o;->ON_CREATE:Landroidx/lifecycle/o;

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, LB0/o;->r(Z)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    new-instance v0, LJ1/U;

    .line 88
    .line 89
    new-instance v2, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    const-string v3, "Fragment "

    .line 92
    .line 93
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v1, " did not call through to super.onCreate()"

    .line 100
    .line 101
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw v0

    .line 112
    :cond_2
    iget-object v0, v1, LJ1/q;->r:Landroid/os/Bundle;

    .line 113
    .line 114
    if-eqz v0, :cond_3

    .line 115
    .line 116
    const-string v4, "android:support:fragments"

    .line 117
    .line 118
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    iget-object v4, v1, LJ1/q;->J:LJ1/H;

    .line 125
    .line 126
    invoke-virtual {v4, v0}, LJ1/H;->R(Landroid/os/Parcelable;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v1, LJ1/q;->J:LJ1/H;

    .line 130
    .line 131
    iput-boolean v3, v0, LJ1/H;->E:Z

    .line 132
    .line 133
    iput-boolean v3, v0, LJ1/H;->F:Z

    .line 134
    .line 135
    iget-object v4, v0, LJ1/H;->L:LJ1/K;

    .line 136
    .line 137
    iput-boolean v3, v4, LJ1/K;->g:Z

    .line 138
    .line 139
    invoke-virtual {v0, v2}, LJ1/H;->t(I)V

    .line 140
    .line 141
    .line 142
    :cond_3
    iput v2, v1, LJ1/q;->q:I

    .line 143
    .line 144
    return-void
.end method

.method public final f()V
    .locals 8

    .line 1
    iget-object v0, p0, LJ1/N;->c:LJ1/q;

    .line 2
    .line 3
    iget-boolean v1, v0, LJ1/q;->C:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x3

    .line 9
    invoke-static {v1}, LJ1/H;->F(I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const-string v3, "FragmentManager"

    .line 14
    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v4, "moveto CREATE_VIEW: "

    .line 20
    .line 21
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v2, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, LJ1/q;->w(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iget-object v4, v0, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :cond_2
    iget v4, v0, LJ1/q;->M:I

    .line 47
    .line 48
    if-eqz v4, :cond_6

    .line 49
    .line 50
    const/4 v5, -0x1

    .line 51
    if-eq v4, v5, :cond_5

    .line 52
    .line 53
    iget-object v5, v0, LJ1/q;->H:LJ1/H;

    .line 54
    .line 55
    iget-object v5, v5, LJ1/H;->u:LC3/a;

    .line 56
    .line 57
    invoke-virtual {v5, v4}, LC3/a;->J(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Landroid/view/ViewGroup;

    .line 62
    .line 63
    if-nez v4, :cond_4

    .line 64
    .line 65
    iget-boolean v5, v0, LJ1/q;->E:Z

    .line 66
    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_3
    :try_start_0
    invoke-virtual {v0}, LJ1/q;->C()Landroid/content/Context;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iget v2, v0, LJ1/q;->M:I

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    goto :goto_0

    .line 86
    :catch_0
    const-string v1, "unknown"

    .line 87
    .line 88
    :goto_0
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v4, "No view found for id 0x"

    .line 93
    .line 94
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget v4, v0, LJ1/q;->M:I

    .line 98
    .line 99
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    const-string v4, " ("

    .line 107
    .line 108
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v1, ") for fragment "

    .line 115
    .line 116
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v2

    .line 130
    :cond_4
    instance-of v5, v4, Landroidx/fragment/app/FragmentContainerView;

    .line 131
    .line 132
    if-nez v5, :cond_7

    .line 133
    .line 134
    sget-object v5, LK1/d;->a:LK1/c;

    .line 135
    .line 136
    new-instance v5, LK1/a;

    .line 137
    .line 138
    new-instance v6, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    const-string v7, "Attempting to add fragment "

    .line 141
    .line 142
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v7, " to container "

    .line 149
    .line 150
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v7, " which is not a FragmentContainerView"

    .line 157
    .line 158
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    invoke-direct {v5, v0, v6}, LK1/a;-><init>(LJ1/q;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v5}, LK1/d;->b(LK1/a;)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0}, LK1/d;->a(LJ1/q;)LK1/c;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 180
    .line 181
    new-instance v2, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    const-string v3, "Cannot create fragment "

    .line 184
    .line 185
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    const-string v0, " for a container view with no id"

    .line 192
    .line 193
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v1

    .line 204
    :cond_6
    const/4 v4, 0x0

    .line 205
    :cond_7
    :goto_1
    iput-object v4, v0, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 206
    .line 207
    iget-object v5, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 208
    .line 209
    invoke-virtual {v0, v2, v4, v5}, LJ1/q;->B(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 210
    .line 211
    .line 212
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 213
    .line 214
    const/4 v5, 0x2

    .line 215
    if-eqz v2, :cond_c

    .line 216
    .line 217
    const/4 v6, 0x0

    .line 218
    invoke-virtual {v2, v6}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 219
    .line 220
    .line 221
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 222
    .line 223
    const v7, 0x7f0900d9

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2, v7, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    if-eqz v4, :cond_8

    .line 230
    .line 231
    invoke-virtual {p0}, LJ1/N;->b()V

    .line 232
    .line 233
    .line 234
    :cond_8
    iget-boolean v2, v0, LJ1/q;->O:Z

    .line 235
    .line 236
    if-eqz v2, :cond_9

    .line 237
    .line 238
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 239
    .line 240
    const/16 v4, 0x8

    .line 241
    .line 242
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    :cond_9
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 246
    .line 247
    sget-object v4, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 248
    .line 249
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-eqz v2, :cond_a

    .line 254
    .line 255
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 256
    .line 257
    invoke-static {v1}, Lw1/z;->c(Landroid/view/View;)V

    .line 258
    .line 259
    .line 260
    goto :goto_2

    .line 261
    :cond_a
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 262
    .line 263
    new-instance v4, LC0/D;

    .line 264
    .line 265
    invoke-direct {v4, v1, v2}, LC0/D;-><init>(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v2, v4}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 269
    .line 270
    .line 271
    :goto_2
    iget-object v1, v0, LJ1/q;->J:LJ1/H;

    .line 272
    .line 273
    invoke-virtual {v1, v5}, LJ1/H;->t(I)V

    .line 274
    .line 275
    .line 276
    iget-object v1, p0, LJ1/N;->a:LB0/o;

    .line 277
    .line 278
    invoke-virtual {v1, v6}, LB0/o;->B(Z)V

    .line 279
    .line 280
    .line 281
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 282
    .line 283
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 288
    .line 289
    invoke-virtual {v2}, Landroid/view/View;->getAlpha()F

    .line 290
    .line 291
    .line 292
    move-result v2

    .line 293
    invoke-virtual {v0}, LJ1/q;->g()LJ1/p;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    iput v2, v4, LJ1/p;->j:F

    .line 298
    .line 299
    iget-object v2, v0, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 300
    .line 301
    if-eqz v2, :cond_c

    .line 302
    .line 303
    if-nez v1, :cond_c

    .line 304
    .line 305
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 306
    .line 307
    invoke-virtual {v1}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    if-eqz v1, :cond_b

    .line 312
    .line 313
    invoke-virtual {v0}, LJ1/q;->g()LJ1/p;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    iput-object v1, v2, LJ1/p;->k:Landroid/view/View;

    .line 318
    .line 319
    invoke-static {v5}, LJ1/H;->F(I)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    if-eqz v2, :cond_b

    .line 324
    .line 325
    new-instance v2, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    const-string v4, "requestFocus: Saved focused view "

    .line 328
    .line 329
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v1, " for Fragment "

    .line 336
    .line 337
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-static {v3, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 348
    .line 349
    .line 350
    :cond_b
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 351
    .line 352
    const/4 v2, 0x0

    .line 353
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 354
    .line 355
    .line 356
    :cond_c
    iput v5, v0, LJ1/q;->q:I

    .line 357
    .line 358
    return-void
.end method

.method public final g()V
    .locals 8

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean v0, v1, LJ1/q;->B:Z

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, LJ1/q;->o()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    move v0, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move v0, v3

    .line 44
    :goto_0
    iget-object v4, p0, LJ1/N;->b:LE/c0;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v5, v1, LJ1/q;->u:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v6, v4, LE/c0;->s:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v6, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, LJ1/M;

    .line 59
    .line 60
    :cond_2
    if-nez v0, :cond_7

    .line 61
    .line 62
    iget-object v5, v4, LE/c0;->t:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, LJ1/K;

    .line 65
    .line 66
    iget-object v6, v5, LJ1/K;->b:Ljava/util/HashMap;

    .line 67
    .line 68
    iget-object v7, v1, LJ1/q;->u:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    if-nez v6, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    iget-boolean v6, v5, LJ1/K;->e:Z

    .line 78
    .line 79
    if-eqz v6, :cond_4

    .line 80
    .line 81
    iget-boolean v5, v5, LJ1/K;->f:Z

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    :goto_1
    move v5, v2

    .line 85
    :goto_2
    if-eqz v5, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    iget-object v0, v1, LJ1/q;->x:Ljava/lang/String;

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-virtual {v4, v0}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    iget-boolean v2, v0, LJ1/q;->Q:Z

    .line 99
    .line 100
    if-eqz v2, :cond_6

    .line 101
    .line 102
    iput-object v0, v1, LJ1/q;->w:LJ1/q;

    .line 103
    .line 104
    :cond_6
    iput v3, v1, LJ1/q;->q:I

    .line 105
    .line 106
    return-void

    .line 107
    :cond_7
    :goto_3
    iget-object v5, v1, LJ1/q;->I:LJ1/u;

    .line 108
    .line 109
    if-eqz v5, :cond_8

    .line 110
    .line 111
    iget-object v2, v4, LE/c0;->t:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v2, LJ1/K;

    .line 114
    .line 115
    iget-boolean v2, v2, LJ1/K;->f:Z

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_8
    iget-object v5, v5, LJ1/u;->u:Lh/h;

    .line 119
    .line 120
    if-eqz v5, :cond_9

    .line 121
    .line 122
    invoke-virtual {v5}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    xor-int/2addr v2, v5

    .line 127
    :cond_9
    :goto_4
    if-eqz v0, :cond_a

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_a
    if-eqz v2, :cond_b

    .line 131
    .line 132
    :goto_5
    iget-object v0, v4, LE/c0;->t:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v0, LJ1/K;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, LJ1/K;->c(LJ1/q;)V

    .line 137
    .line 138
    .line 139
    :cond_b
    iget-object v0, v1, LJ1/q;->J:LJ1/H;

    .line 140
    .line 141
    invoke-virtual {v0}, LJ1/H;->k()V

    .line 142
    .line 143
    .line 144
    iget-object v0, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 145
    .line 146
    sget-object v2, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 147
    .line 148
    invoke-virtual {v0, v2}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 149
    .line 150
    .line 151
    iput v3, v1, LJ1/q;->q:I

    .line 152
    .line 153
    iput-boolean v3, v1, LJ1/q;->S:Z

    .line 154
    .line 155
    iput-boolean v3, v1, LJ1/q;->Z:Z

    .line 156
    .line 157
    const/4 v0, 0x1

    .line 158
    iput-boolean v0, v1, LJ1/q;->S:Z

    .line 159
    .line 160
    iget-boolean v0, v1, LJ1/q;->S:Z

    .line 161
    .line 162
    if-eqz v0, :cond_f

    .line 163
    .line 164
    iget-object v0, p0, LJ1/N;->a:LB0/o;

    .line 165
    .line 166
    invoke-virtual {v0, v3}, LB0/o;->s(Z)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, LE/c0;->o()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    :cond_c
    :goto_6
    if-ge v3, v2, :cond_d

    .line 178
    .line 179
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    add-int/lit8 v3, v3, 0x1

    .line 184
    .line 185
    check-cast v5, LJ1/N;

    .line 186
    .line 187
    if-eqz v5, :cond_c

    .line 188
    .line 189
    iget-object v5, v5, LJ1/N;->c:LJ1/q;

    .line 190
    .line 191
    iget-object v6, v1, LJ1/q;->u:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v7, v5, LJ1/q;->x:Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    if-eqz v6, :cond_c

    .line 200
    .line 201
    iput-object v1, v5, LJ1/q;->w:LJ1/q;

    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    iput-object v6, v5, LJ1/q;->x:Ljava/lang/String;

    .line 205
    .line 206
    goto :goto_6

    .line 207
    :cond_d
    iget-object v0, v1, LJ1/q;->x:Ljava/lang/String;

    .line 208
    .line 209
    if-eqz v0, :cond_e

    .line 210
    .line 211
    invoke-virtual {v4, v0}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    iput-object v0, v1, LJ1/q;->w:LJ1/q;

    .line 216
    .line 217
    :cond_e
    invoke-virtual {v4, p0}, LE/c0;->x(LJ1/N;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :cond_f
    new-instance v0, LJ1/U;

    .line 222
    .line 223
    new-instance v2, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    const-string v3, "Fragment "

    .line 226
    .line 227
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    const-string v1, " did not call through to super.onDestroy()"

    .line 234
    .line 235
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw v0
.end method

.method public final h()V
    .locals 6

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom CREATE_VIEW: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v2, v1, LJ1/q;->U:Landroid/view/View;

    .line 34
    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object v0, v1, LJ1/q;->J:LJ1/H;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-virtual {v0, v2}, LJ1/H;->t(I)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, LJ1/q;->U:Landroid/view/View;

    .line 47
    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    iget-object v0, v1, LJ1/q;->d0:LJ1/P;

    .line 51
    .line 52
    invoke-virtual {v0}, LJ1/P;->g()V

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 56
    .line 57
    iget-object v0, v0, Landroidx/lifecycle/z;->d:Landroidx/lifecycle/p;

    .line 58
    .line 59
    sget-object v3, Landroidx/lifecycle/p;->s:Landroidx/lifecycle/p;

    .line 60
    .line 61
    invoke-virtual {v0, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-ltz v0, :cond_2

    .line 66
    .line 67
    iget-object v0, v1, LJ1/q;->d0:LJ1/P;

    .line 68
    .line 69
    sget-object v3, Landroidx/lifecycle/o;->ON_DESTROY:Landroidx/lifecycle/o;

    .line 70
    .line 71
    invoke-virtual {v0, v3}, LJ1/P;->c(Landroidx/lifecycle/o;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iput v2, v1, LJ1/q;->q:I

    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, v1, LJ1/q;->S:Z

    .line 78
    .line 79
    invoke-virtual {v1}, LJ1/q;->u()V

    .line 80
    .line 81
    .line 82
    iget-boolean v2, v1, LJ1/q;->S:Z

    .line 83
    .line 84
    if-eqz v2, :cond_5

    .line 85
    .line 86
    invoke-interface {v1}, Landroidx/lifecycle/l0;->f()Landroidx/lifecycle/k0;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const-string v3, "store"

    .line 91
    .line 92
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sget-object v3, LP1/a;->b:LP1/a;

    .line 96
    .line 97
    const-string v4, "defaultCreationExtras"

    .line 98
    .line 99
    invoke-static {v3, v4}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance v4, LE/c0;

    .line 103
    .line 104
    sget-object v5, LS1/a;->c:LJ1/J;

    .line 105
    .line 106
    invoke-direct {v4, v2, v5, v3}, LE/c0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;LP1/c;)V

    .line 107
    .line 108
    .line 109
    const-class v2, LS1/a;

    .line 110
    .line 111
    invoke-static {v2}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v2}, Lkotlin/jvm/internal/f;->b()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    if-eqz v3, :cond_4

    .line 120
    .line 121
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 122
    .line 123
    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v4, v3, v2}, LE/c0;->v(Ljava/lang/String;Lkotlin/jvm/internal/f;)Landroidx/lifecycle/f0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    check-cast v2, LS1/a;

    .line 132
    .line 133
    iget-object v2, v2, LS1/a;->b:Lr/S;

    .line 134
    .line 135
    invoke-virtual {v2}, Lr/S;->f()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-gtz v3, :cond_3

    .line 140
    .line 141
    iput-boolean v0, v1, LJ1/q;->F:Z

    .line 142
    .line 143
    iget-object v2, p0, LJ1/N;->a:LB0/o;

    .line 144
    .line 145
    invoke-virtual {v2, v0}, LB0/o;->C(Z)V

    .line 146
    .line 147
    .line 148
    const/4 v2, 0x0

    .line 149
    iput-object v2, v1, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 150
    .line 151
    iput-object v2, v1, LJ1/q;->U:Landroid/view/View;

    .line 152
    .line 153
    iput-object v2, v1, LJ1/q;->d0:LJ1/P;

    .line 154
    .line 155
    iget-object v3, v1, LJ1/q;->e0:Landroidx/lifecycle/J;

    .line 156
    .line 157
    invoke-virtual {v3, v2}, Landroidx/lifecycle/G;->k(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iput-boolean v0, v1, LJ1/q;->D:Z

    .line 161
    .line 162
    return-void

    .line 163
    :cond_3
    invoke-virtual {v2, v0}, Lr/S;->g(I)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    new-instance v0, Ljava/lang/ClassCastException;

    .line 171
    .line 172
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 173
    .line 174
    .line 175
    throw v0

    .line 176
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 177
    .line 178
    const-string v1, "Local and anonymous classes can not be ViewModels"

    .line 179
    .line 180
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v0

    .line 184
    :cond_5
    new-instance v0, LJ1/U;

    .line 185
    .line 186
    new-instance v2, Ljava/lang/StringBuilder;

    .line 187
    .line 188
    const-string v3, "Fragment "

    .line 189
    .line 190
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v1, " did not call through to super.onDestroyView()"

    .line 197
    .line 198
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v0
.end method

.method public final i()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "FragmentManager"

    .line 7
    .line 8
    iget-object v3, p0, LJ1/N;->c:LJ1/q;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "movefrom ATTACHED: "

    .line 15
    .line 16
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    const/4 v1, -0x1

    .line 30
    iput v1, v3, LJ1/q;->q:I

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    iput-boolean v4, v3, LJ1/q;->S:Z

    .line 34
    .line 35
    invoke-virtual {v3}, LJ1/q;->v()V

    .line 36
    .line 37
    .line 38
    iget-boolean v5, v3, LJ1/q;->S:Z

    .line 39
    .line 40
    if-eqz v5, :cond_7

    .line 41
    .line 42
    iget-object v5, v3, LJ1/q;->J:LJ1/H;

    .line 43
    .line 44
    iget-boolean v6, v5, LJ1/H;->G:Z

    .line 45
    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    invoke-virtual {v5}, LJ1/H;->k()V

    .line 49
    .line 50
    .line 51
    new-instance v5, LJ1/H;

    .line 52
    .line 53
    invoke-direct {v5}, LJ1/H;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v5, v3, LJ1/q;->J:LJ1/H;

    .line 57
    .line 58
    :cond_1
    iget-object v5, p0, LJ1/N;->a:LB0/o;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, LB0/o;->t(Z)V

    .line 61
    .line 62
    .line 63
    iput v1, v3, LJ1/q;->q:I

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    iput-object v1, v3, LJ1/q;->I:LJ1/u;

    .line 67
    .line 68
    iput-object v1, v3, LJ1/q;->K:LJ1/q;

    .line 69
    .line 70
    iput-object v1, v3, LJ1/q;->H:LJ1/H;

    .line 71
    .line 72
    iget-boolean v1, v3, LJ1/q;->B:Z

    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v3}, LJ1/q;->o()Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    if-nez v1, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    iget-object v1, p0, LJ1/N;->b:LE/c0;

    .line 84
    .line 85
    iget-object v1, v1, LE/c0;->t:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, LJ1/K;

    .line 88
    .line 89
    iget-object v4, v1, LJ1/K;->b:Ljava/util/HashMap;

    .line 90
    .line 91
    iget-object v5, v3, LJ1/q;->u:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    iget-boolean v4, v1, LJ1/K;->e:Z

    .line 101
    .line 102
    if-eqz v4, :cond_4

    .line 103
    .line 104
    iget-boolean v1, v1, LJ1/K;->f:Z

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    :goto_0
    const/4 v1, 0x1

    .line 108
    :goto_1
    if-eqz v1, :cond_6

    .line 109
    .line 110
    :goto_2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v1, "initState called for fragment: "

    .line 119
    .line 120
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    :cond_5
    invoke-virtual {v3}, LJ1/q;->m()V

    .line 134
    .line 135
    .line 136
    :cond_6
    return-void

    .line 137
    :cond_7
    new-instance v0, LJ1/U;

    .line 138
    .line 139
    new-instance v1, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v2, "Fragment "

    .line 142
    .line 143
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v2, " did not call through to super.onDetach()"

    .line 150
    .line 151
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, LJ1/N;->c:LJ1/q;

    .line 2
    .line 3
    iget-boolean v1, v0, LJ1/q;->C:Z

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    iget-boolean v1, v0, LJ1/q;->D:Z

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-boolean v1, v0, LJ1/q;->F:Z

    .line 12
    .line 13
    if-nez v1, :cond_2

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-static {v1}, LJ1/H;->F(I)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, "moveto CREATE_VIEW: "

    .line 25
    .line 26
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-string v2, "FragmentManager"

    .line 37
    .line 38
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    :cond_0
    iget-object v1, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, LJ1/q;->w(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    iget-object v3, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 49
    .line 50
    invoke-virtual {v0, v1, v2, v3}, LJ1/q;->B(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    invoke-virtual {v1, v2}, Landroid/view/View;->setSaveFromParentEnabled(Z)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 62
    .line 63
    const v3, 0x7f0900d9

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v3, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-boolean v1, v0, LJ1/q;->O:Z

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 74
    .line 75
    const/16 v3, 0x8

    .line 76
    .line 77
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v1, v0, LJ1/q;->J:LJ1/H;

    .line 81
    .line 82
    const/4 v3, 0x2

    .line 83
    invoke-virtual {v1, v3}, LJ1/H;->t(I)V

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, LJ1/N;->a:LB0/o;

    .line 87
    .line 88
    invoke-virtual {v1, v2}, LB0/o;->B(Z)V

    .line 89
    .line 90
    .line 91
    iput v3, v0, LJ1/q;->q:I

    .line 92
    .line 93
    :cond_2
    return-void
.end method

.method public final k()V
    .locals 10

    .line 1
    iget-object v0, p0, LJ1/N;->b:LE/c0;

    .line 2
    .line 3
    iget-boolean v1, p0, LJ1/N;->d:Z

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "FragmentManager"

    .line 7
    .line 8
    iget-object v4, p0, LJ1/N;->c:LJ1/q;

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v2}, LJ1/H;->F(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v1, "Ignoring re-entrant call to moveToExpectedState() for "

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :cond_1
    const/4 v1, 0x1

    .line 37
    const/4 v5, 0x0

    .line 38
    :try_start_0
    iput-boolean v1, p0, LJ1/N;->d:Z

    .line 39
    .line 40
    move v6, v5

    .line 41
    :goto_0
    invoke-virtual {p0}, LJ1/N;->d()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    iget v8, v4, LJ1/q;->q:I

    .line 46
    .line 47
    const/4 v9, 0x3

    .line 48
    if-eq v7, v8, :cond_9

    .line 49
    .line 50
    if-le v7, v8, :cond_4

    .line 51
    .line 52
    add-int/lit8 v8, v8, 0x1

    .line 53
    .line 54
    packed-switch v8, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    goto/16 :goto_1

    .line 58
    .line 59
    :pswitch_0
    invoke-virtual {p0}, LJ1/N;->n()V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :catchall_0
    move-exception v0

    .line 65
    goto/16 :goto_3

    .line 66
    .line 67
    :pswitch_1
    const/4 v6, 0x6

    .line 68
    iput v6, v4, LJ1/q;->q:I

    .line 69
    .line 70
    goto/16 :goto_1

    .line 71
    .line 72
    :pswitch_2
    invoke-virtual {p0}, LJ1/N;->p()V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :pswitch_3
    iget-object v6, v4, LJ1/q;->U:Landroid/view/View;

    .line 78
    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    iget-object v6, v4, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 82
    .line 83
    if-eqz v6, :cond_3

    .line 84
    .line 85
    invoke-virtual {v4}, LJ1/q;->k()LJ1/H;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-virtual {v7}, LJ1/H;->D()Lx3/k;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    invoke-static {v6, v7}, LJ1/h;->f(Landroid/view/ViewGroup;Lx3/k;)LJ1/h;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iget-object v7, v4, LJ1/q;->U:Landroid/view/View;

    .line 98
    .line 99
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-static {v7}, LC0/S;->b(I)I

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-static {v2}, LJ1/H;->F(I)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-eqz v8, :cond_2

    .line 115
    .line 116
    new-instance v8, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    const-string v9, "SpecialEffectsController: Enqueuing add operation for fragment "

    .line 119
    .line 120
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-static {v3, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    :cond_2
    invoke-virtual {v6, v7, v2, p0}, LJ1/h;->a(IILJ1/N;)V

    .line 134
    .line 135
    .line 136
    :cond_3
    const/4 v6, 0x4

    .line 137
    iput v6, v4, LJ1/q;->q:I

    .line 138
    .line 139
    goto/16 :goto_1

    .line 140
    .line 141
    :pswitch_4
    invoke-virtual {p0}, LJ1/N;->a()V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :pswitch_5
    invoke-virtual {p0}, LJ1/N;->j()V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, LJ1/N;->f()V

    .line 150
    .line 151
    .line 152
    goto/16 :goto_1

    .line 153
    .line 154
    :pswitch_6
    invoke-virtual {p0}, LJ1/N;->e()V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_1

    .line 158
    .line 159
    :pswitch_7
    invoke-virtual {p0}, LJ1/N;->c()V

    .line 160
    .line 161
    .line 162
    goto/16 :goto_1

    .line 163
    .line 164
    :cond_4
    add-int/lit8 v8, v8, -0x1

    .line 165
    .line 166
    packed-switch v8, :pswitch_data_1

    .line 167
    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :pswitch_8
    invoke-virtual {p0}, LJ1/N;->l()V

    .line 172
    .line 173
    .line 174
    goto/16 :goto_1

    .line 175
    .line 176
    :pswitch_9
    const/4 v6, 0x5

    .line 177
    iput v6, v4, LJ1/q;->q:I

    .line 178
    .line 179
    goto/16 :goto_1

    .line 180
    .line 181
    :pswitch_a
    invoke-virtual {p0}, LJ1/N;->q()V

    .line 182
    .line 183
    .line 184
    goto :goto_1

    .line 185
    :pswitch_b
    invoke-static {v9}, LJ1/H;->F(I)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_5

    .line 190
    .line 191
    new-instance v6, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 194
    .line 195
    .line 196
    const-string v7, "movefrom ACTIVITY_CREATED: "

    .line 197
    .line 198
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    .line 210
    .line 211
    :cond_5
    iget-object v6, v4, LJ1/q;->U:Landroid/view/View;

    .line 212
    .line 213
    if-eqz v6, :cond_6

    .line 214
    .line 215
    iget-object v6, v4, LJ1/q;->s:Landroid/util/SparseArray;

    .line 216
    .line 217
    if-nez v6, :cond_6

    .line 218
    .line 219
    invoke-virtual {p0}, LJ1/N;->o()V

    .line 220
    .line 221
    .line 222
    :cond_6
    iget-object v6, v4, LJ1/q;->U:Landroid/view/View;

    .line 223
    .line 224
    if-eqz v6, :cond_8

    .line 225
    .line 226
    iget-object v6, v4, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 227
    .line 228
    if-eqz v6, :cond_8

    .line 229
    .line 230
    invoke-virtual {v4}, LJ1/q;->k()LJ1/H;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-virtual {v7}, LJ1/H;->D()Lx3/k;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    invoke-static {v6, v7}, LJ1/h;->f(Landroid/view/ViewGroup;Lx3/k;)LJ1/h;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-static {v2}, LJ1/H;->F(I)Z

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    if-eqz v7, :cond_7

    .line 250
    .line 251
    new-instance v7, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    const-string v8, "SpecialEffectsController: Enqueuing remove operation for fragment "

    .line 254
    .line 255
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    invoke-static {v3, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    :cond_7
    invoke-virtual {v6, v1, v9, p0}, LJ1/h;->a(IILJ1/N;)V

    .line 269
    .line 270
    .line 271
    :cond_8
    iput v9, v4, LJ1/q;->q:I

    .line 272
    .line 273
    goto :goto_1

    .line 274
    :pswitch_c
    iput-boolean v5, v4, LJ1/q;->D:Z

    .line 275
    .line 276
    iput v2, v4, LJ1/q;->q:I

    .line 277
    .line 278
    goto :goto_1

    .line 279
    :pswitch_d
    invoke-virtual {p0}, LJ1/N;->h()V

    .line 280
    .line 281
    .line 282
    iput v1, v4, LJ1/q;->q:I

    .line 283
    .line 284
    goto :goto_1

    .line 285
    :pswitch_e
    invoke-virtual {p0}, LJ1/N;->g()V

    .line 286
    .line 287
    .line 288
    goto :goto_1

    .line 289
    :pswitch_f
    invoke-virtual {p0}, LJ1/N;->i()V

    .line 290
    .line 291
    .line 292
    :goto_1
    move v6, v1

    .line 293
    goto/16 :goto_0

    .line 294
    .line 295
    :cond_9
    if-nez v6, :cond_c

    .line 296
    .line 297
    const/4 v6, -0x1

    .line 298
    if-ne v8, v6, :cond_c

    .line 299
    .line 300
    iget-boolean v6, v4, LJ1/q;->B:Z

    .line 301
    .line 302
    if-eqz v6, :cond_c

    .line 303
    .line 304
    invoke-virtual {v4}, LJ1/q;->o()Z

    .line 305
    .line 306
    .line 307
    move-result v6

    .line 308
    if-nez v6, :cond_c

    .line 309
    .line 310
    invoke-static {v9}, LJ1/H;->F(I)Z

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    if-eqz v6, :cond_a

    .line 315
    .line 316
    new-instance v6, Ljava/lang/StringBuilder;

    .line 317
    .line 318
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 319
    .line 320
    .line 321
    const-string v7, "Cleaning up state of never attached fragment: "

    .line 322
    .line 323
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 324
    .line 325
    .line 326
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v6

    .line 333
    invoke-static {v3, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 334
    .line 335
    .line 336
    :cond_a
    iget-object v6, v0, LE/c0;->t:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v6, LJ1/K;

    .line 339
    .line 340
    invoke-virtual {v6, v4}, LJ1/K;->c(LJ1/q;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, p0}, LE/c0;->x(LJ1/N;)V

    .line 344
    .line 345
    .line 346
    invoke-static {v9}, LJ1/H;->F(I)Z

    .line 347
    .line 348
    .line 349
    move-result v0

    .line 350
    if-eqz v0, :cond_b

    .line 351
    .line 352
    new-instance v0, Ljava/lang/StringBuilder;

    .line 353
    .line 354
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 355
    .line 356
    .line 357
    const-string v6, "initState called for fragment: "

    .line 358
    .line 359
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v3, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 370
    .line 371
    .line 372
    :cond_b
    invoke-virtual {v4}, LJ1/q;->m()V

    .line 373
    .line 374
    .line 375
    :cond_c
    iget-boolean v0, v4, LJ1/q;->Y:Z

    .line 376
    .line 377
    if-eqz v0, :cond_12

    .line 378
    .line 379
    iget-object v0, v4, LJ1/q;->U:Landroid/view/View;

    .line 380
    .line 381
    if-eqz v0, :cond_10

    .line 382
    .line 383
    iget-object v0, v4, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 384
    .line 385
    if-eqz v0, :cond_10

    .line 386
    .line 387
    invoke-virtual {v4}, LJ1/q;->k()LJ1/H;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-virtual {v6}, LJ1/H;->D()Lx3/k;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    invoke-static {v0, v6}, LJ1/h;->f(Landroid/view/ViewGroup;Lx3/k;)LJ1/h;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    iget-boolean v6, v4, LJ1/q;->O:Z

    .line 400
    .line 401
    if-eqz v6, :cond_e

    .line 402
    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-static {v2}, LJ1/H;->F(I)Z

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    if-eqz v2, :cond_d

    .line 411
    .line 412
    new-instance v2, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    const-string v6, "SpecialEffectsController: Enqueuing hide operation for fragment "

    .line 415
    .line 416
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 427
    .line 428
    .line 429
    :cond_d
    invoke-virtual {v0, v9, v1, p0}, LJ1/h;->a(IILJ1/N;)V

    .line 430
    .line 431
    .line 432
    goto :goto_2

    .line 433
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 434
    .line 435
    .line 436
    invoke-static {v2}, LJ1/H;->F(I)Z

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    if-eqz v6, :cond_f

    .line 441
    .line 442
    new-instance v6, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    const-string v7, "SpecialEffectsController: Enqueuing show operation for fragment "

    .line 445
    .line 446
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v6

    .line 456
    invoke-static {v3, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 457
    .line 458
    .line 459
    :cond_f
    invoke-virtual {v0, v2, v1, p0}, LJ1/h;->a(IILJ1/N;)V

    .line 460
    .line 461
    .line 462
    :cond_10
    :goto_2
    iget-object v0, v4, LJ1/q;->H:LJ1/H;

    .line 463
    .line 464
    if-eqz v0, :cond_11

    .line 465
    .line 466
    iget-boolean v2, v4, LJ1/q;->A:Z

    .line 467
    .line 468
    if-eqz v2, :cond_11

    .line 469
    .line 470
    invoke-static {v4}, LJ1/H;->G(LJ1/q;)Z

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    if-eqz v2, :cond_11

    .line 475
    .line 476
    iput-boolean v1, v0, LJ1/H;->D:Z

    .line 477
    .line 478
    :cond_11
    iput-boolean v5, v4, LJ1/q;->Y:Z

    .line 479
    .line 480
    iget-object v0, v4, LJ1/q;->J:LJ1/H;

    .line 481
    .line 482
    invoke-virtual {v0}, LJ1/H;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 483
    .line 484
    .line 485
    :cond_12
    iput-boolean v5, p0, LJ1/N;->d:Z

    .line 486
    .line 487
    return-void

    .line 488
    :goto_3
    iput-boolean v5, p0, LJ1/N;->d:Z

    .line 489
    .line 490
    throw v0

    .line 491
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch
.end method

.method public final l()V
    .locals 3

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom RESUMED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, LJ1/q;->J:LJ1/H;

    .line 30
    .line 31
    const/4 v2, 0x5

    .line 32
    invoke-virtual {v0, v2}, LJ1/H;->t(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, v1, LJ1/q;->U:Landroid/view/View;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    iget-object v0, v1, LJ1/q;->d0:LJ1/P;

    .line 40
    .line 41
    sget-object v2, Landroidx/lifecycle/o;->ON_PAUSE:Landroidx/lifecycle/o;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, LJ1/P;->c(Landroidx/lifecycle/o;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    iget-object v0, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 47
    .line 48
    sget-object v2, Landroidx/lifecycle/o;->ON_PAUSE:Landroidx/lifecycle/o;

    .line 49
    .line 50
    invoke-virtual {v0, v2}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x6

    .line 54
    iput v0, v1, LJ1/q;->q:I

    .line 55
    .line 56
    const/4 v0, 0x1

    .line 57
    iput-boolean v0, v1, LJ1/q;->S:Z

    .line 58
    .line 59
    iget-object v0, p0, LJ1/N;->a:LB0/o;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1}, LB0/o;->u(Z)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final m(Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    iget-object v0, p0, LJ1/N;->c:LJ1/q;

    .line 2
    .line 3
    iget-object v1, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 12
    .line 13
    const-string v1, "android:view_state"

    .line 14
    .line 15
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, v0, LJ1/q;->s:Landroid/util/SparseArray;

    .line 20
    .line 21
    iget-object p1, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 22
    .line 23
    const-string v1, "android:view_registry_state"

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, v0, LJ1/q;->t:Landroid/os/Bundle;

    .line 30
    .line 31
    iget-object p1, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 32
    .line 33
    const-string v1, "android:target_state"

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iput-object p1, v0, LJ1/q;->x:Ljava/lang/String;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 44
    .line 45
    const-string v1, "android:target_req_state"

    .line 46
    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    iput p1, v0, LJ1/q;->y:I

    .line 53
    .line 54
    :cond_1
    iget-object p1, v0, LJ1/q;->r:Landroid/os/Bundle;

    .line 55
    .line 56
    const-string v1, "android:user_visible_hint"

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    invoke-virtual {p1, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    iput-boolean p1, v0, LJ1/q;->W:Z

    .line 64
    .line 65
    if-nez p1, :cond_2

    .line 66
    .line 67
    iput-boolean v2, v0, LJ1/q;->V:Z

    .line 68
    .line 69
    :cond_2
    :goto_0
    return-void
.end method

.method public final n()V
    .locals 7

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "FragmentManager"

    .line 7
    .line 8
    iget-object v2, p0, LJ1/N;->c:LJ1/q;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v3, "moveto RESUMED: "

    .line 15
    .line 16
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v2, LJ1/q;->X:LJ1/p;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    move-object v0, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v0, v0, LJ1/p;->k:Landroid/view/View;

    .line 37
    .line 38
    :goto_0
    if-eqz v0, :cond_5

    .line 39
    .line 40
    iget-object v4, v2, LJ1/q;->U:Landroid/view/View;

    .line 41
    .line 42
    if-ne v0, v4, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    :goto_1
    if-eqz v4, :cond_5

    .line 50
    .line 51
    iget-object v5, v2, LJ1/q;->U:Landroid/view/View;

    .line 52
    .line 53
    if-ne v4, v5, :cond_4

    .line 54
    .line 55
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    const/4 v5, 0x2

    .line 60
    invoke-static {v5}, LJ1/H;->F(I)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_5

    .line 65
    .line 66
    new-instance v5, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v6, "requestFocus: Restoring focused view "

    .line 69
    .line 70
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, " "

    .line 77
    .line 78
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    if-eqz v4, :cond_3

    .line 82
    .line 83
    const-string v0, "succeeded"

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_3
    const-string v0, "failed"

    .line 87
    .line 88
    :goto_3
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, " on Fragment "

    .line 92
    .line 93
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    const-string v0, " resulting in focused view "

    .line 100
    .line 101
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    iget-object v0, v2, LJ1/q;->U:Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 118
    .line 119
    .line 120
    goto :goto_4

    .line 121
    :cond_4
    invoke-interface {v4}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    goto :goto_1

    .line 126
    :cond_5
    :goto_4
    invoke-virtual {v2}, LJ1/q;->g()LJ1/p;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iput-object v3, v0, LJ1/p;->k:Landroid/view/View;

    .line 131
    .line 132
    iget-object v0, v2, LJ1/q;->J:LJ1/H;

    .line 133
    .line 134
    invoke-virtual {v0}, LJ1/H;->L()V

    .line 135
    .line 136
    .line 137
    iget-object v0, v2, LJ1/q;->J:LJ1/H;

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    invoke-virtual {v0, v1}, LJ1/H;->y(Z)Z

    .line 141
    .line 142
    .line 143
    const/4 v0, 0x7

    .line 144
    iput v0, v2, LJ1/q;->q:I

    .line 145
    .line 146
    const/4 v1, 0x0

    .line 147
    iput-boolean v1, v2, LJ1/q;->S:Z

    .line 148
    .line 149
    const/4 v4, 0x1

    .line 150
    iput-boolean v4, v2, LJ1/q;->S:Z

    .line 151
    .line 152
    iget-boolean v4, v2, LJ1/q;->S:Z

    .line 153
    .line 154
    if-eqz v4, :cond_7

    .line 155
    .line 156
    iget-object v4, v2, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 157
    .line 158
    sget-object v5, Landroidx/lifecycle/o;->ON_RESUME:Landroidx/lifecycle/o;

    .line 159
    .line 160
    invoke-virtual {v4, v5}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, v2, LJ1/q;->U:Landroid/view/View;

    .line 164
    .line 165
    if-eqz v4, :cond_6

    .line 166
    .line 167
    iget-object v4, v2, LJ1/q;->d0:LJ1/P;

    .line 168
    .line 169
    iget-object v4, v4, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 170
    .line 171
    invoke-virtual {v4, v5}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 172
    .line 173
    .line 174
    :cond_6
    iget-object v4, v2, LJ1/q;->J:LJ1/H;

    .line 175
    .line 176
    iput-boolean v1, v4, LJ1/H;->E:Z

    .line 177
    .line 178
    iput-boolean v1, v4, LJ1/H;->F:Z

    .line 179
    .line 180
    iget-object v5, v4, LJ1/H;->L:LJ1/K;

    .line 181
    .line 182
    iput-boolean v1, v5, LJ1/K;->g:Z

    .line 183
    .line 184
    invoke-virtual {v4, v0}, LJ1/H;->t(I)V

    .line 185
    .line 186
    .line 187
    iget-object v0, p0, LJ1/N;->a:LB0/o;

    .line 188
    .line 189
    invoke-virtual {v0, v1}, LB0/o;->x(Z)V

    .line 190
    .line 191
    .line 192
    iput-object v3, v2, LJ1/q;->r:Landroid/os/Bundle;

    .line 193
    .line 194
    iput-object v3, v2, LJ1/q;->s:Landroid/util/SparseArray;

    .line 195
    .line 196
    iput-object v3, v2, LJ1/q;->t:Landroid/os/Bundle;

    .line 197
    .line 198
    return-void

    .line 199
    :cond_7
    new-instance v0, LJ1/U;

    .line 200
    .line 201
    new-instance v1, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    const-string v3, "Fragment "

    .line 204
    .line 205
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    const-string v2, " did not call through to super.onResume()"

    .line 212
    .line 213
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    throw v0
.end method

.method public final o()V
    .locals 3

    .line 1
    iget-object v0, p0, LJ1/N;->c:LJ1/q;

    .line 2
    .line 3
    iget-object v1, v0, LJ1/q;->U:Landroid/view/View;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v1, 0x2

    .line 9
    invoke-static {v1}, LJ1/H;->F(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v2, "Saving view state for fragment "

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " with view "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const-string v2, "FragmentManager"

    .line 40
    .line 41
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    :cond_1
    new-instance v1, Landroid/util/SparseArray;

    .line 45
    .line 46
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v2, v0, LJ1/q;->U:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {v2, v1}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-lez v2, :cond_2

    .line 59
    .line 60
    iput-object v1, v0, LJ1/q;->s:Landroid/util/SparseArray;

    .line 61
    .line 62
    :cond_2
    new-instance v1, Landroid/os/Bundle;

    .line 63
    .line 64
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 65
    .line 66
    .line 67
    iget-object v2, v0, LJ1/q;->d0:LJ1/P;

    .line 68
    .line 69
    iget-object v2, v2, LJ1/P;->u:LZ/m;

    .line 70
    .line 71
    invoke-virtual {v2, v1}, LZ/m;->A(Landroid/os/Bundle;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_3

    .line 79
    .line 80
    iput-object v1, v0, LJ1/q;->t:Landroid/os/Bundle;

    .line 81
    .line 82
    :cond_3
    :goto_0
    return-void
.end method

.method public final p()V
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "moveto STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, LJ1/q;->J:LJ1/H;

    .line 30
    .line 31
    invoke-virtual {v0}, LJ1/H;->L()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, LJ1/q;->J:LJ1/H;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-virtual {v0, v2}, LJ1/H;->y(Z)Z

    .line 38
    .line 39
    .line 40
    const/4 v0, 0x5

    .line 41
    iput v0, v1, LJ1/q;->q:I

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    iput-boolean v2, v1, LJ1/q;->S:Z

    .line 45
    .line 46
    invoke-virtual {v1}, LJ1/q;->y()V

    .line 47
    .line 48
    .line 49
    iget-boolean v3, v1, LJ1/q;->S:Z

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    iget-object v3, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 54
    .line 55
    sget-object v4, Landroidx/lifecycle/o;->ON_START:Landroidx/lifecycle/o;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 58
    .line 59
    .line 60
    iget-object v3, v1, LJ1/q;->U:Landroid/view/View;

    .line 61
    .line 62
    if-eqz v3, :cond_1

    .line 63
    .line 64
    iget-object v3, v1, LJ1/q;->d0:LJ1/P;

    .line 65
    .line 66
    iget-object v3, v3, LJ1/P;->t:Landroidx/lifecycle/z;

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 72
    .line 73
    iput-boolean v2, v1, LJ1/H;->E:Z

    .line 74
    .line 75
    iput-boolean v2, v1, LJ1/H;->F:Z

    .line 76
    .line 77
    iget-object v3, v1, LJ1/H;->L:LJ1/K;

    .line 78
    .line 79
    iput-boolean v2, v3, LJ1/K;->g:Z

    .line 80
    .line 81
    invoke-virtual {v1, v0}, LJ1/H;->t(I)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, LJ1/N;->a:LB0/o;

    .line 85
    .line 86
    invoke-virtual {v0, v2}, LB0/o;->z(Z)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    new-instance v0, LJ1/U;

    .line 91
    .line 92
    new-instance v2, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, "Fragment "

    .line 95
    .line 96
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, " did not call through to super.onStart()"

    .line 103
    .line 104
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw v0
.end method

.method public final q()V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    iget-object v1, p0, LJ1/N;->c:LJ1/q;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "movefrom STARTED: "

    .line 13
    .line 14
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v2, "FragmentManager"

    .line 25
    .line 26
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, v1, LJ1/q;->J:LJ1/H;

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, v0, LJ1/H;->F:Z

    .line 33
    .line 34
    iget-object v3, v0, LJ1/H;->L:LJ1/K;

    .line 35
    .line 36
    iput-boolean v2, v3, LJ1/K;->g:Z

    .line 37
    .line 38
    const/4 v2, 0x4

    .line 39
    invoke-virtual {v0, v2}, LJ1/H;->t(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, LJ1/q;->U:Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object v0, v1, LJ1/q;->d0:LJ1/P;

    .line 47
    .line 48
    sget-object v3, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, LJ1/P;->c(Landroidx/lifecycle/o;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    iget-object v0, v1, LJ1/q;->c0:Landroidx/lifecycle/z;

    .line 54
    .line 55
    sget-object v3, Landroidx/lifecycle/o;->ON_STOP:Landroidx/lifecycle/o;

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Landroidx/lifecycle/z;->f(Landroidx/lifecycle/o;)V

    .line 58
    .line 59
    .line 60
    iput v2, v1, LJ1/q;->q:I

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    iput-boolean v0, v1, LJ1/q;->S:Z

    .line 64
    .line 65
    invoke-virtual {v1}, LJ1/q;->z()V

    .line 66
    .line 67
    .line 68
    iget-boolean v2, v1, LJ1/q;->S:Z

    .line 69
    .line 70
    if-eqz v2, :cond_2

    .line 71
    .line 72
    iget-object v1, p0, LJ1/N;->a:LB0/o;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, LB0/o;->A(Z)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    new-instance v0, LJ1/U;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v3, "Fragment "

    .line 83
    .line 84
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, " did not call through to super.onStop()"

    .line 91
    .line 92
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v0
.end method
