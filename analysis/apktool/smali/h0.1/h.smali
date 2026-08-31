.class public final Lh0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh0/g;


# instance fields
.field public final a:LC0/t;

.field public final b:LC0/q;

.field public final c:LC0/u;

.field public final d:Lh0/o;

.field public final e:Lh0/e;

.field public final f:Lh0/p;

.field public final g:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

.field public h:Lr/z;

.field public final i:Lr/C;

.field public j:Lh0/o;


# direct methods
.method public constructor <init>(LC0/s;LC0/t;LC0/q;LC0/u;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lh0/h;->a:LC0/t;

    .line 5
    .line 6
    iput-object p3, p0, Lh0/h;->b:LC0/q;

    .line 7
    .line 8
    iput-object p4, p0, Lh0/h;->c:LC0/u;

    .line 9
    .line 10
    new-instance v0, Lh0/o;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x6

    .line 14
    const/4 v3, 0x2

    .line 15
    invoke-direct {v0, v3, v1, v2}, Lh0/o;-><init>(ILB5/e;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lh0/h;->d:Lh0/o;

    .line 19
    .line 20
    new-instance v8, Lh0/e;

    .line 21
    .line 22
    new-instance v0, LC0/q;

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v7, 0x6

    .line 26
    const/4 v1, 0x0

    .line 27
    const-class v3, Lh0/h;

    .line 28
    .line 29
    const-string v4, "invalidateOwnerFocusState"

    .line 30
    .line 31
    const-string v5, "invalidateOwnerFocusState()V"

    .line 32
    .line 33
    move-object v2, p0

    .line 34
    invoke-direct/range {v0 .. v7}, LC0/q;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    move-object v7, v0

    .line 38
    new-instance v0, LC/i;

    .line 39
    .line 40
    const/4 v2, 0x4

    .line 41
    const-class v3, Lh0/h;

    .line 42
    .line 43
    const-string v5, "rootState"

    .line 44
    .line 45
    const-string v6, "getRootState()Landroidx/compose/ui/focus/FocusState;"

    .line 46
    .line 47
    move-object v4, p0

    .line 48
    invoke-direct/range {v0 .. v6}, LC/i;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    move-object v9, v0

    .line 52
    new-instance v0, LC0/u;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    const-class v3, Lh0/h;

    .line 56
    .line 57
    const-string v5, "activeFocusTargetNode"

    .line 58
    .line 59
    const-string v6, "getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;"

    .line 60
    .line 61
    invoke-direct/range {v0 .. v6}, LC0/u;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    move-object v1, v0

    .line 65
    invoke-direct {v8, p1, v7, v9, v1}, Lh0/e;-><init>(LC0/s;LC0/q;LC/i;LC0/u;)V

    .line 66
    .line 67
    .line 68
    iput-object v8, p0, Lh0/h;->e:Lh0/e;

    .line 69
    .line 70
    new-instance v0, Lh0/p;

    .line 71
    .line 72
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lr/O;->b()Lr/G;

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lh0/h;->f:Lh0/p;

    .line 79
    .line 80
    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    .line 81
    .line 82
    invoke-direct {v0, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;-><init>(Lh0/h;)V

    .line 83
    .line 84
    .line 85
    iput-object v0, p0, Lh0/h;->g:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    .line 86
    .line 87
    new-instance v0, Lr/C;

    .line 88
    .line 89
    const/4 v1, 0x1

    .line 90
    invoke-direct {v0, v1}, Lr/C;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, Lh0/h;->i:Lr/C;

    .line 94
    .line 95
    return-void
.end method


# virtual methods
.method public final a(Z)Z
    .locals 9

    .line 1
    iget-object p1, p0, Lh0/h;->j:Lh0/o;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto/16 :goto_6

    .line 7
    .line 8
    :cond_0
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p0, v1}, Lh0/h;->e(Lh0/o;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lh0/n;->q:Lh0/n;

    .line 13
    .line 14
    sget-object v3, Lh0/n;->t:Lh0/n;

    .line 15
    .line 16
    invoke-virtual {p1, v2, v3}, Lh0/o;->x0(Lh0/n;Lh0/n;)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p1, Lc0/l;->q:Lc0/l;

    .line 20
    .line 21
    iget-boolean v2, v2, Lc0/l;->D:Z

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    const-string v2, "visitAncestors called on an unattached node"

    .line 26
    .line 27
    invoke-static {v2}, Ly0/a;->b(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v2, p1, Lc0/l;->q:Lc0/l;

    .line 31
    .line 32
    iget-object v2, v2, Lc0/l;->u:Lc0/l;

    .line 33
    .line 34
    invoke-static {p1}, LB0/g;->u(LB0/m;)LB0/L;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    if-eqz p1, :cond_c

    .line 39
    .line 40
    iget-object v4, p1, LB0/L;->U:LB0/g0;

    .line 41
    .line 42
    iget-object v4, v4, LB0/g0;->e:Lc0/l;

    .line 43
    .line 44
    iget v4, v4, Lc0/l;->t:I

    .line 45
    .line 46
    and-int/lit16 v4, v4, 0x400

    .line 47
    .line 48
    if-eqz v4, :cond_a

    .line 49
    .line 50
    :goto_1
    if-eqz v2, :cond_a

    .line 51
    .line 52
    iget v4, v2, Lc0/l;->s:I

    .line 53
    .line 54
    and-int/lit16 v4, v4, 0x400

    .line 55
    .line 56
    if-eqz v4, :cond_9

    .line 57
    .line 58
    move-object v5, v1

    .line 59
    move-object v4, v2

    .line 60
    :goto_2
    if-eqz v4, :cond_9

    .line 61
    .line 62
    instance-of v6, v4, Lh0/o;

    .line 63
    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    check-cast v4, Lh0/o;

    .line 67
    .line 68
    sget-object v6, Lh0/n;->r:Lh0/n;

    .line 69
    .line 70
    invoke-virtual {v4, v6, v3}, Lh0/o;->x0(Lh0/n;Lh0/n;)V

    .line 71
    .line 72
    .line 73
    goto :goto_5

    .line 74
    :cond_2
    iget v6, v4, Lc0/l;->s:I

    .line 75
    .line 76
    and-int/lit16 v6, v6, 0x400

    .line 77
    .line 78
    if-eqz v6, :cond_8

    .line 79
    .line 80
    instance-of v6, v4, LB0/n;

    .line 81
    .line 82
    if-eqz v6, :cond_8

    .line 83
    .line 84
    move-object v6, v4

    .line 85
    check-cast v6, LB0/n;

    .line 86
    .line 87
    iget-object v6, v6, LB0/n;->F:Lc0/l;

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    :goto_3
    if-eqz v6, :cond_7

    .line 91
    .line 92
    iget v8, v6, Lc0/l;->s:I

    .line 93
    .line 94
    and-int/lit16 v8, v8, 0x400

    .line 95
    .line 96
    if-eqz v8, :cond_6

    .line 97
    .line 98
    add-int/lit8 v7, v7, 0x1

    .line 99
    .line 100
    if-ne v7, v0, :cond_3

    .line 101
    .line 102
    move-object v4, v6

    .line 103
    goto :goto_4

    .line 104
    :cond_3
    if-nez v5, :cond_4

    .line 105
    .line 106
    new-instance v5, LR/e;

    .line 107
    .line 108
    const/16 v8, 0x10

    .line 109
    .line 110
    new-array v8, v8, [Lc0/l;

    .line 111
    .line 112
    invoke-direct {v5, v8}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    if-eqz v4, :cond_5

    .line 116
    .line 117
    invoke-virtual {v5, v4}, LR/e;->c(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object v4, v1

    .line 121
    :cond_5
    invoke-virtual {v5, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    :goto_4
    iget-object v6, v6, Lc0/l;->v:Lc0/l;

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_7
    if-ne v7, v0, :cond_8

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_8
    :goto_5
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    goto :goto_2

    .line 135
    :cond_9
    iget-object v2, v2, Lc0/l;->u:Lc0/l;

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_a
    invoke-virtual {p1}, LB0/L;->s()LB0/L;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    if-eqz p1, :cond_b

    .line 143
    .line 144
    iget-object v2, p1, LB0/L;->U:LB0/g0;

    .line 145
    .line 146
    if-eqz v2, :cond_b

    .line 147
    .line 148
    iget-object v2, v2, LB0/g0;->d:LB0/B0;

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_b
    move-object v2, v1

    .line 152
    goto :goto_0

    .line 153
    :cond_c
    :goto_6
    return v0
.end method

.method public final b(IZZ)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p2, :cond_3

    .line 3
    .line 4
    iget-object v1, p0, Lh0/h;->d:Lh0/o;

    .line 5
    .line 6
    invoke-static {v1, p1}, Lh0/d;->t(Lh0/o;I)Lh0/b;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x2

    .line 19
    if-eq p1, p2, :cond_1

    .line 20
    .line 21
    const/4 p2, 0x3

    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, LC2/e;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-virtual {p0, p2}, Lh0/h;->a(Z)Z

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    invoke-virtual {p0, p2}, Lh0/h;->a(Z)Z

    .line 38
    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_4

    .line 41
    .line 42
    if-eqz p3, :cond_4

    .line 43
    .line 44
    iget-object p1, p0, Lh0/h;->b:LC0/q;

    .line 45
    .line 46
    invoke-virtual {p1}, LC0/q;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_4
    return v0
.end method

.method public final c(Landroid/view/KeyEvent;LB5/a;)Z
    .locals 13

    .line 1
    iget-object v0, p0, Lh0/h;->d:Lh0/o;

    .line 2
    .line 3
    const-string v1, "FocusOwnerImpl:dispatchKeyEvent"

    .line 4
    .line 5
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Lh0/h;->e:Lh0/e;

    .line 9
    .line 10
    iget-boolean v1, v1, Lh0/e;->f:Z

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-string p1, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    .line 16
    .line 17
    sget-object p2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 18
    .line 19
    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 23
    .line 24
    .line 25
    return v2

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto/16 :goto_1e

    .line 28
    .line 29
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Lh0/h;->f(Landroid/view/KeyEvent;)Z

    .line 30
    .line 31
    .line 32
    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    return v2

    .line 39
    :cond_1
    :try_start_2
    invoke-static {v0}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    const-string v3, "visitAncestors called on an unattached node"

    .line 44
    .line 45
    const/16 v4, 0x10

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    const/4 v6, 0x1

    .line 49
    if-eqz v1, :cond_7

    .line 50
    .line 51
    :try_start_3
    iget-object v7, v1, Lc0/l;->q:Lc0/l;

    .line 52
    .line 53
    iget-boolean v7, v7, Lc0/l;->D:Z

    .line 54
    .line 55
    if-nez v7, :cond_2

    .line 56
    .line 57
    const-string v7, "visitLocalDescendants called on an unattached node"

    .line 58
    .line 59
    invoke-static {v7}, Ly0/a;->b(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v7, v1, Lc0/l;->q:Lc0/l;

    .line 63
    .line 64
    iget v8, v7, Lc0/l;->t:I

    .line 65
    .line 66
    and-int/lit16 v8, v8, 0x2400

    .line 67
    .line 68
    if-eqz v8, :cond_5

    .line 69
    .line 70
    iget-object v7, v7, Lc0/l;->v:Lc0/l;

    .line 71
    .line 72
    move-object v8, v5

    .line 73
    :goto_0
    if-eqz v7, :cond_6

    .line 74
    .line 75
    iget v9, v7, Lc0/l;->s:I

    .line 76
    .line 77
    and-int/lit16 v10, v9, 0x2400

    .line 78
    .line 79
    if-eqz v10, :cond_4

    .line 80
    .line 81
    and-int/lit16 v9, v9, 0x400

    .line 82
    .line 83
    if-eqz v9, :cond_3

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    move-object v8, v7

    .line 87
    :cond_4
    iget-object v7, v7, Lc0/l;->v:Lc0/l;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_5
    move-object v8, v5

    .line 91
    :cond_6
    :goto_1
    if-nez v8, :cond_22

    .line 92
    .line 93
    :cond_7
    if-eqz v1, :cond_14

    .line 94
    .line 95
    iget-object v7, v1, Lc0/l;->q:Lc0/l;

    .line 96
    .line 97
    iget-boolean v7, v7, Lc0/l;->D:Z

    .line 98
    .line 99
    if-nez v7, :cond_8

    .line 100
    .line 101
    invoke-static {v3}, Ly0/a;->b(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_8
    iget-object v7, v1, Lc0/l;->q:Lc0/l;

    .line 105
    .line 106
    invoke-static {v1}, LB0/g;->u(LB0/m;)LB0/L;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :goto_2
    if-eqz v1, :cond_13

    .line 111
    .line 112
    iget-object v8, v1, LB0/L;->U:LB0/g0;

    .line 113
    .line 114
    iget-object v8, v8, LB0/g0;->e:Lc0/l;

    .line 115
    .line 116
    iget v8, v8, Lc0/l;->t:I

    .line 117
    .line 118
    and-int/lit16 v8, v8, 0x2000

    .line 119
    .line 120
    if-eqz v8, :cond_11

    .line 121
    .line 122
    :goto_3
    if-eqz v7, :cond_11

    .line 123
    .line 124
    iget v8, v7, Lc0/l;->s:I

    .line 125
    .line 126
    and-int/lit16 v8, v8, 0x2000

    .line 127
    .line 128
    if-eqz v8, :cond_10

    .line 129
    .line 130
    move-object v9, v5

    .line 131
    move-object v8, v7

    .line 132
    :goto_4
    if-eqz v8, :cond_10

    .line 133
    .line 134
    instance-of v10, v8, Lt0/c;

    .line 135
    .line 136
    if-eqz v10, :cond_9

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_9
    iget v10, v8, Lc0/l;->s:I

    .line 140
    .line 141
    and-int/lit16 v10, v10, 0x2000

    .line 142
    .line 143
    if-eqz v10, :cond_f

    .line 144
    .line 145
    instance-of v10, v8, LB0/n;

    .line 146
    .line 147
    if-eqz v10, :cond_f

    .line 148
    .line 149
    move-object v10, v8

    .line 150
    check-cast v10, LB0/n;

    .line 151
    .line 152
    iget-object v10, v10, LB0/n;->F:Lc0/l;

    .line 153
    .line 154
    move v11, v2

    .line 155
    :goto_5
    if-eqz v10, :cond_e

    .line 156
    .line 157
    iget v12, v10, Lc0/l;->s:I

    .line 158
    .line 159
    and-int/lit16 v12, v12, 0x2000

    .line 160
    .line 161
    if-eqz v12, :cond_d

    .line 162
    .line 163
    add-int/lit8 v11, v11, 0x1

    .line 164
    .line 165
    if-ne v11, v6, :cond_a

    .line 166
    .line 167
    move-object v8, v10

    .line 168
    goto :goto_6

    .line 169
    :cond_a
    if-nez v9, :cond_b

    .line 170
    .line 171
    new-instance v9, LR/e;

    .line 172
    .line 173
    new-array v12, v4, [Lc0/l;

    .line 174
    .line 175
    invoke-direct {v9, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_b
    if-eqz v8, :cond_c

    .line 179
    .line 180
    invoke-virtual {v9, v8}, LR/e;->c(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    move-object v8, v5

    .line 184
    :cond_c
    invoke-virtual {v9, v10}, LR/e;->c(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_d
    :goto_6
    iget-object v10, v10, Lc0/l;->v:Lc0/l;

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_e
    if-ne v11, v6, :cond_f

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_f
    invoke-static {v9}, LB0/g;->f(LR/e;)Lc0/l;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    goto :goto_4

    .line 198
    :cond_10
    iget-object v7, v7, Lc0/l;->u:Lc0/l;

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :cond_11
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    if-eqz v1, :cond_12

    .line 206
    .line 207
    iget-object v7, v1, LB0/L;->U:LB0/g0;

    .line 208
    .line 209
    if-eqz v7, :cond_12

    .line 210
    .line 211
    iget-object v7, v7, LB0/g0;->d:LB0/B0;

    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_12
    move-object v7, v5

    .line 215
    goto :goto_2

    .line 216
    :cond_13
    move-object v8, v5

    .line 217
    :goto_7
    check-cast v8, Lt0/c;

    .line 218
    .line 219
    if-eqz v8, :cond_14

    .line 220
    .line 221
    check-cast v8, Lc0/l;

    .line 222
    .line 223
    iget-object v8, v8, Lc0/l;->q:Lc0/l;

    .line 224
    .line 225
    goto/16 :goto_e

    .line 226
    .line 227
    :cond_14
    iget-object v1, v0, Lc0/l;->q:Lc0/l;

    .line 228
    .line 229
    iget-boolean v1, v1, Lc0/l;->D:Z

    .line 230
    .line 231
    if-nez v1, :cond_15

    .line 232
    .line 233
    invoke-static {v3}, Ly0/a;->b(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    :cond_15
    iget-object v1, v0, Lc0/l;->q:Lc0/l;

    .line 237
    .line 238
    iget-object v1, v1, Lc0/l;->u:Lc0/l;

    .line 239
    .line 240
    invoke-static {v0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    :goto_8
    if-eqz v0, :cond_20

    .line 245
    .line 246
    iget-object v7, v0, LB0/L;->U:LB0/g0;

    .line 247
    .line 248
    iget-object v7, v7, LB0/g0;->e:Lc0/l;

    .line 249
    .line 250
    iget v7, v7, Lc0/l;->t:I

    .line 251
    .line 252
    and-int/lit16 v7, v7, 0x2000

    .line 253
    .line 254
    if-eqz v7, :cond_1e

    .line 255
    .line 256
    :goto_9
    if-eqz v1, :cond_1e

    .line 257
    .line 258
    iget v7, v1, Lc0/l;->s:I

    .line 259
    .line 260
    and-int/lit16 v7, v7, 0x2000

    .line 261
    .line 262
    if-eqz v7, :cond_1d

    .line 263
    .line 264
    move-object v7, v1

    .line 265
    move-object v8, v5

    .line 266
    :goto_a
    if-eqz v7, :cond_1d

    .line 267
    .line 268
    instance-of v9, v7, Lt0/c;

    .line 269
    .line 270
    if-eqz v9, :cond_16

    .line 271
    .line 272
    goto :goto_d

    .line 273
    :cond_16
    iget v9, v7, Lc0/l;->s:I

    .line 274
    .line 275
    and-int/lit16 v9, v9, 0x2000

    .line 276
    .line 277
    if-eqz v9, :cond_1c

    .line 278
    .line 279
    instance-of v9, v7, LB0/n;

    .line 280
    .line 281
    if-eqz v9, :cond_1c

    .line 282
    .line 283
    move-object v9, v7

    .line 284
    check-cast v9, LB0/n;

    .line 285
    .line 286
    iget-object v9, v9, LB0/n;->F:Lc0/l;

    .line 287
    .line 288
    move v10, v2

    .line 289
    :goto_b
    if-eqz v9, :cond_1b

    .line 290
    .line 291
    iget v11, v9, Lc0/l;->s:I

    .line 292
    .line 293
    and-int/lit16 v11, v11, 0x2000

    .line 294
    .line 295
    if-eqz v11, :cond_1a

    .line 296
    .line 297
    add-int/lit8 v10, v10, 0x1

    .line 298
    .line 299
    if-ne v10, v6, :cond_17

    .line 300
    .line 301
    move-object v7, v9

    .line 302
    goto :goto_c

    .line 303
    :cond_17
    if-nez v8, :cond_18

    .line 304
    .line 305
    new-instance v8, LR/e;

    .line 306
    .line 307
    new-array v11, v4, [Lc0/l;

    .line 308
    .line 309
    invoke-direct {v8, v11}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    :cond_18
    if-eqz v7, :cond_19

    .line 313
    .line 314
    invoke-virtual {v8, v7}, LR/e;->c(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    move-object v7, v5

    .line 318
    :cond_19
    invoke-virtual {v8, v9}, LR/e;->c(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_1a
    :goto_c
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 322
    .line 323
    goto :goto_b

    .line 324
    :cond_1b
    if-ne v10, v6, :cond_1c

    .line 325
    .line 326
    goto :goto_a

    .line 327
    :cond_1c
    invoke-static {v8}, LB0/g;->f(LR/e;)Lc0/l;

    .line 328
    .line 329
    .line 330
    move-result-object v7

    .line 331
    goto :goto_a

    .line 332
    :cond_1d
    iget-object v1, v1, Lc0/l;->u:Lc0/l;

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_1e
    invoke-virtual {v0}, LB0/L;->s()LB0/L;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v0, :cond_1f

    .line 340
    .line 341
    iget-object v1, v0, LB0/L;->U:LB0/g0;

    .line 342
    .line 343
    if-eqz v1, :cond_1f

    .line 344
    .line 345
    iget-object v1, v1, LB0/g0;->d:LB0/B0;

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_1f
    move-object v1, v5

    .line 349
    goto :goto_8

    .line 350
    :cond_20
    move-object v7, v5

    .line 351
    :goto_d
    check-cast v7, Lt0/c;

    .line 352
    .line 353
    if-eqz v7, :cond_21

    .line 354
    .line 355
    check-cast v7, Lc0/l;

    .line 356
    .line 357
    iget-object v8, v7, Lc0/l;->q:Lc0/l;

    .line 358
    .line 359
    goto :goto_e

    .line 360
    :cond_21
    move-object v8, v5

    .line 361
    :cond_22
    :goto_e
    if-eqz v8, :cond_45

    .line 362
    .line 363
    iget-object v0, v8, Lc0/l;->q:Lc0/l;

    .line 364
    .line 365
    iget-boolean v0, v0, Lc0/l;->D:Z

    .line 366
    .line 367
    if-nez v0, :cond_23

    .line 368
    .line 369
    invoke-static {v3}, Ly0/a;->b(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    :cond_23
    iget-object v0, v8, Lc0/l;->q:Lc0/l;

    .line 373
    .line 374
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 375
    .line 376
    invoke-static {v8}, LB0/g;->u(LB0/m;)LB0/L;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    move-object v3, v5

    .line 381
    :goto_f
    if-eqz v1, :cond_2f

    .line 382
    .line 383
    iget-object v7, v1, LB0/L;->U:LB0/g0;

    .line 384
    .line 385
    iget-object v7, v7, LB0/g0;->e:Lc0/l;

    .line 386
    .line 387
    iget v7, v7, Lc0/l;->t:I

    .line 388
    .line 389
    and-int/lit16 v7, v7, 0x2000

    .line 390
    .line 391
    if-eqz v7, :cond_2d

    .line 392
    .line 393
    :goto_10
    if-eqz v0, :cond_2d

    .line 394
    .line 395
    iget v7, v0, Lc0/l;->s:I

    .line 396
    .line 397
    and-int/lit16 v7, v7, 0x2000

    .line 398
    .line 399
    if-eqz v7, :cond_2c

    .line 400
    .line 401
    move-object v7, v0

    .line 402
    move-object v9, v5

    .line 403
    :goto_11
    if-eqz v7, :cond_2c

    .line 404
    .line 405
    instance-of v10, v7, Lt0/c;

    .line 406
    .line 407
    if-eqz v10, :cond_25

    .line 408
    .line 409
    if-nez v3, :cond_24

    .line 410
    .line 411
    new-instance v3, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 414
    .line 415
    .line 416
    :cond_24
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    goto :goto_14

    .line 420
    :cond_25
    iget v10, v7, Lc0/l;->s:I

    .line 421
    .line 422
    and-int/lit16 v10, v10, 0x2000

    .line 423
    .line 424
    if-eqz v10, :cond_2b

    .line 425
    .line 426
    instance-of v10, v7, LB0/n;

    .line 427
    .line 428
    if-eqz v10, :cond_2b

    .line 429
    .line 430
    move-object v10, v7

    .line 431
    check-cast v10, LB0/n;

    .line 432
    .line 433
    iget-object v10, v10, LB0/n;->F:Lc0/l;

    .line 434
    .line 435
    move v11, v2

    .line 436
    :goto_12
    if-eqz v10, :cond_2a

    .line 437
    .line 438
    iget v12, v10, Lc0/l;->s:I

    .line 439
    .line 440
    and-int/lit16 v12, v12, 0x2000

    .line 441
    .line 442
    if-eqz v12, :cond_29

    .line 443
    .line 444
    add-int/lit8 v11, v11, 0x1

    .line 445
    .line 446
    if-ne v11, v6, :cond_26

    .line 447
    .line 448
    move-object v7, v10

    .line 449
    goto :goto_13

    .line 450
    :cond_26
    if-nez v9, :cond_27

    .line 451
    .line 452
    new-instance v9, LR/e;

    .line 453
    .line 454
    new-array v12, v4, [Lc0/l;

    .line 455
    .line 456
    invoke-direct {v9, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    :cond_27
    if-eqz v7, :cond_28

    .line 460
    .line 461
    invoke-virtual {v9, v7}, LR/e;->c(Ljava/lang/Object;)V

    .line 462
    .line 463
    .line 464
    move-object v7, v5

    .line 465
    :cond_28
    invoke-virtual {v9, v10}, LR/e;->c(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    :cond_29
    :goto_13
    iget-object v10, v10, Lc0/l;->v:Lc0/l;

    .line 469
    .line 470
    goto :goto_12

    .line 471
    :cond_2a
    if-ne v11, v6, :cond_2b

    .line 472
    .line 473
    goto :goto_11

    .line 474
    :cond_2b
    :goto_14
    invoke-static {v9}, LB0/g;->f(LR/e;)Lc0/l;

    .line 475
    .line 476
    .line 477
    move-result-object v7

    .line 478
    goto :goto_11

    .line 479
    :cond_2c
    iget-object v0, v0, Lc0/l;->u:Lc0/l;

    .line 480
    .line 481
    goto :goto_10

    .line 482
    :cond_2d
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    if-eqz v1, :cond_2e

    .line 487
    .line 488
    iget-object v0, v1, LB0/L;->U:LB0/g0;

    .line 489
    .line 490
    if-eqz v0, :cond_2e

    .line 491
    .line 492
    iget-object v0, v0, LB0/g0;->d:LB0/B0;

    .line 493
    .line 494
    goto :goto_f

    .line 495
    :cond_2e
    move-object v0, v5

    .line 496
    goto :goto_f

    .line 497
    :cond_2f
    if-eqz v3, :cond_32

    .line 498
    .line 499
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    add-int/lit8 v0, v0, -0x1

    .line 504
    .line 505
    if-ltz v0, :cond_32

    .line 506
    .line 507
    :goto_15
    add-int/lit8 v1, v0, -0x1

    .line 508
    .line 509
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    check-cast v0, Lt0/c;

    .line 514
    .line 515
    invoke-interface {v0, p1}, Lt0/c;->k(Landroid/view/KeyEvent;)Z

    .line 516
    .line 517
    .line 518
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 519
    if-eqz v0, :cond_30

    .line 520
    .line 521
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 522
    .line 523
    .line 524
    return v6

    .line 525
    :cond_30
    if-gez v1, :cond_31

    .line 526
    .line 527
    goto :goto_16

    .line 528
    :cond_31
    move v0, v1

    .line 529
    goto :goto_15

    .line 530
    :cond_32
    :goto_16
    :try_start_4
    iget-object v0, v8, Lc0/l;->q:Lc0/l;

    .line 531
    .line 532
    move-object v1, v5

    .line 533
    :goto_17
    if-eqz v0, :cond_3a

    .line 534
    .line 535
    instance-of v7, v0, Lt0/c;

    .line 536
    .line 537
    if-eqz v7, :cond_33

    .line 538
    .line 539
    check-cast v0, Lt0/c;

    .line 540
    .line 541
    invoke-interface {v0, p1}, Lt0/c;->k(Landroid/view/KeyEvent;)Z

    .line 542
    .line 543
    .line 544
    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 545
    if-eqz v0, :cond_39

    .line 546
    .line 547
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 548
    .line 549
    .line 550
    return v6

    .line 551
    :cond_33
    :try_start_5
    iget v7, v0, Lc0/l;->s:I

    .line 552
    .line 553
    and-int/lit16 v7, v7, 0x2000

    .line 554
    .line 555
    if-eqz v7, :cond_39

    .line 556
    .line 557
    instance-of v7, v0, LB0/n;

    .line 558
    .line 559
    if-eqz v7, :cond_39

    .line 560
    .line 561
    move-object v7, v0

    .line 562
    check-cast v7, LB0/n;

    .line 563
    .line 564
    iget-object v7, v7, LB0/n;->F:Lc0/l;

    .line 565
    .line 566
    move v9, v2

    .line 567
    :goto_18
    if-eqz v7, :cond_38

    .line 568
    .line 569
    iget v10, v7, Lc0/l;->s:I

    .line 570
    .line 571
    and-int/lit16 v10, v10, 0x2000

    .line 572
    .line 573
    if-eqz v10, :cond_37

    .line 574
    .line 575
    add-int/lit8 v9, v9, 0x1

    .line 576
    .line 577
    if-ne v9, v6, :cond_34

    .line 578
    .line 579
    move-object v0, v7

    .line 580
    goto :goto_19

    .line 581
    :cond_34
    if-nez v1, :cond_35

    .line 582
    .line 583
    new-instance v1, LR/e;

    .line 584
    .line 585
    new-array v10, v4, [Lc0/l;

    .line 586
    .line 587
    invoke-direct {v1, v10}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    :cond_35
    if-eqz v0, :cond_36

    .line 591
    .line 592
    invoke-virtual {v1, v0}, LR/e;->c(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    move-object v0, v5

    .line 596
    :cond_36
    invoke-virtual {v1, v7}, LR/e;->c(Ljava/lang/Object;)V

    .line 597
    .line 598
    .line 599
    :cond_37
    :goto_19
    iget-object v7, v7, Lc0/l;->v:Lc0/l;

    .line 600
    .line 601
    goto :goto_18

    .line 602
    :cond_38
    if-ne v9, v6, :cond_39

    .line 603
    .line 604
    goto :goto_17

    .line 605
    :cond_39
    invoke-static {v1}, LB0/g;->f(LR/e;)Lc0/l;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    goto :goto_17

    .line 610
    :cond_3a
    invoke-interface {p2}, LB5/a;->invoke()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object p2

    .line 614
    check-cast p2, Ljava/lang/Boolean;

    .line 615
    .line 616
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 617
    .line 618
    .line 619
    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 620
    if-eqz p2, :cond_3b

    .line 621
    .line 622
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 623
    .line 624
    .line 625
    return v6

    .line 626
    :cond_3b
    :try_start_6
    iget-object p2, v8, Lc0/l;->q:Lc0/l;

    .line 627
    .line 628
    move-object v0, v5

    .line 629
    :goto_1a
    if-eqz p2, :cond_43

    .line 630
    .line 631
    instance-of v1, p2, Lt0/c;

    .line 632
    .line 633
    if-eqz v1, :cond_3c

    .line 634
    .line 635
    check-cast p2, Lt0/c;

    .line 636
    .line 637
    invoke-interface {p2, p1}, Lt0/c;->K(Landroid/view/KeyEvent;)Z

    .line 638
    .line 639
    .line 640
    move-result p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 641
    if-eqz p2, :cond_42

    .line 642
    .line 643
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 644
    .line 645
    .line 646
    return v6

    .line 647
    :cond_3c
    :try_start_7
    iget v1, p2, Lc0/l;->s:I

    .line 648
    .line 649
    and-int/lit16 v1, v1, 0x2000

    .line 650
    .line 651
    if-eqz v1, :cond_42

    .line 652
    .line 653
    instance-of v1, p2, LB0/n;

    .line 654
    .line 655
    if-eqz v1, :cond_42

    .line 656
    .line 657
    move-object v1, p2

    .line 658
    check-cast v1, LB0/n;

    .line 659
    .line 660
    iget-object v1, v1, LB0/n;->F:Lc0/l;

    .line 661
    .line 662
    move v7, v2

    .line 663
    :goto_1b
    if-eqz v1, :cond_41

    .line 664
    .line 665
    iget v8, v1, Lc0/l;->s:I

    .line 666
    .line 667
    and-int/lit16 v8, v8, 0x2000

    .line 668
    .line 669
    if-eqz v8, :cond_40

    .line 670
    .line 671
    add-int/lit8 v7, v7, 0x1

    .line 672
    .line 673
    if-ne v7, v6, :cond_3d

    .line 674
    .line 675
    move-object p2, v1

    .line 676
    goto :goto_1c

    .line 677
    :cond_3d
    if-nez v0, :cond_3e

    .line 678
    .line 679
    new-instance v0, LR/e;

    .line 680
    .line 681
    new-array v8, v4, [Lc0/l;

    .line 682
    .line 683
    invoke-direct {v0, v8}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    :cond_3e
    if-eqz p2, :cond_3f

    .line 687
    .line 688
    invoke-virtual {v0, p2}, LR/e;->c(Ljava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    move-object p2, v5

    .line 692
    :cond_3f
    invoke-virtual {v0, v1}, LR/e;->c(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    :cond_40
    :goto_1c
    iget-object v1, v1, Lc0/l;->v:Lc0/l;

    .line 696
    .line 697
    goto :goto_1b

    .line 698
    :cond_41
    if-ne v7, v6, :cond_42

    .line 699
    .line 700
    goto :goto_1a

    .line 701
    :cond_42
    invoke-static {v0}, LB0/g;->f(LR/e;)Lc0/l;

    .line 702
    .line 703
    .line 704
    move-result-object p2

    .line 705
    goto :goto_1a

    .line 706
    :cond_43
    if-eqz v3, :cond_45

    .line 707
    .line 708
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 709
    .line 710
    .line 711
    move-result p2

    .line 712
    move v0, v2

    .line 713
    :goto_1d
    if-ge v0, p2, :cond_45

    .line 714
    .line 715
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    check-cast v1, Lt0/c;

    .line 720
    .line 721
    invoke-interface {v1, p1}, Lt0/c;->K(Landroid/view/KeyEvent;)Z

    .line 722
    .line 723
    .line 724
    move-result v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 725
    if-eqz v1, :cond_44

    .line 726
    .line 727
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 728
    .line 729
    .line 730
    return v6

    .line 731
    :cond_44
    add-int/lit8 v0, v0, 0x1

    .line 732
    .line 733
    goto :goto_1d

    .line 734
    :cond_45
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 735
    .line 736
    .line 737
    return v2

    .line 738
    :goto_1e
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 739
    .line 740
    .line 741
    throw p1
.end method

.method public final d(ILi0/c;LB5/c;)Ljava/lang/Boolean;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    iget-object v4, v0, Lh0/h;->d:Lh0/o;

    .line 10
    .line 11
    invoke-static {v4}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    const/16 v8, 0x8

    .line 16
    .line 17
    const/4 v9, 0x4

    .line 18
    const/4 v10, 0x3

    .line 19
    const/4 v11, 0x6

    .line 20
    const/4 v12, 0x5

    .line 21
    const/4 v13, 0x2

    .line 22
    const/4 v14, 0x1

    .line 23
    const/4 v15, 0x7

    .line 24
    iget-object v6, v0, Lh0/h;->c:LC0/u;

    .line 25
    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    if-eqz v5, :cond_28

    .line 29
    .line 30
    invoke-virtual {v6}, LC0/u;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v17

    .line 34
    check-cast v17, LW0/l;

    .line 35
    .line 36
    invoke-virtual {v5}, Lh0/o;->y0()Lh0/k;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    if-ne v1, v14, :cond_0

    .line 41
    .line 42
    iget-object v7, v7, Lh0/k;->b:Lh0/m;

    .line 43
    .line 44
    goto/16 :goto_4

    .line 45
    .line 46
    :cond_0
    if-ne v1, v13, :cond_1

    .line 47
    .line 48
    iget-object v7, v7, Lh0/k;->c:Lh0/m;

    .line 49
    .line 50
    goto/16 :goto_4

    .line 51
    .line 52
    :cond_1
    if-ne v1, v12, :cond_2

    .line 53
    .line 54
    iget-object v7, v7, Lh0/k;->d:Lh0/m;

    .line 55
    .line 56
    goto/16 :goto_4

    .line 57
    .line 58
    :cond_2
    if-ne v1, v11, :cond_3

    .line 59
    .line 60
    iget-object v7, v7, Lh0/k;->e:Lh0/m;

    .line 61
    .line 62
    goto/16 :goto_4

    .line 63
    .line 64
    :cond_3
    if-ne v1, v10, :cond_8

    .line 65
    .line 66
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    if-eqz v11, :cond_5

    .line 71
    .line 72
    if-ne v11, v14, :cond_4

    .line 73
    .line 74
    iget-object v11, v7, Lh0/k;->i:Lh0/m;

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_4
    new-instance v1, LC2/e;

    .line 78
    .line 79
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_5
    iget-object v11, v7, Lh0/k;->h:Lh0/m;

    .line 84
    .line 85
    :goto_0
    sget-object v12, Lh0/m;->b:Lh0/m;

    .line 86
    .line 87
    if-ne v11, v12, :cond_6

    .line 88
    .line 89
    move-object/from16 v11, v16

    .line 90
    .line 91
    :cond_6
    if-nez v11, :cond_7

    .line 92
    .line 93
    iget-object v7, v7, Lh0/k;->f:Lh0/m;

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    move-object v7, v11

    .line 97
    goto :goto_4

    .line 98
    :cond_8
    if-ne v1, v9, :cond_c

    .line 99
    .line 100
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result v11

    .line 104
    if-eqz v11, :cond_a

    .line 105
    .line 106
    if-ne v11, v14, :cond_9

    .line 107
    .line 108
    iget-object v11, v7, Lh0/k;->h:Lh0/m;

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_9
    new-instance v1, LC2/e;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 114
    .line 115
    .line 116
    throw v1

    .line 117
    :cond_a
    iget-object v11, v7, Lh0/k;->i:Lh0/m;

    .line 118
    .line 119
    :goto_1
    sget-object v12, Lh0/m;->b:Lh0/m;

    .line 120
    .line 121
    if-ne v11, v12, :cond_b

    .line 122
    .line 123
    move-object/from16 v11, v16

    .line 124
    .line 125
    :cond_b
    if-nez v11, :cond_7

    .line 126
    .line 127
    iget-object v7, v7, Lh0/k;->g:Lh0/m;

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_c
    if-ne v1, v15, :cond_d

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_d
    if-ne v1, v8, :cond_27

    .line 134
    .line 135
    :goto_2
    new-instance v11, Lh0/a;

    .line 136
    .line 137
    invoke-direct {v11, v1}, Lh0/a;-><init>(I)V

    .line 138
    .line 139
    .line 140
    invoke-static {v5}, Lh0/d;->o(Lh0/o;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v5}, LB0/g;->v(LB0/m;)LB0/t0;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    check-cast v12, LC0/A;

    .line 148
    .line 149
    invoke-virtual {v12}, LC0/A;->getFocusOwner()Lh0/g;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    check-cast v12, Lh0/h;

    .line 154
    .line 155
    iget-object v8, v12, Lh0/h;->j:Lh0/o;

    .line 156
    .line 157
    if-ne v1, v15, :cond_e

    .line 158
    .line 159
    iget-object v7, v7, Lh0/k;->j:Lkotlin/jvm/internal/n;

    .line 160
    .line 161
    invoke-interface {v7, v11}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_e
    iget-object v7, v7, Lh0/k;->k:Lkotlin/jvm/internal/n;

    .line 166
    .line 167
    invoke-interface {v7, v11}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    :goto_3
    iget-boolean v7, v11, Lh0/a;->b:Z

    .line 171
    .line 172
    if-eqz v7, :cond_f

    .line 173
    .line 174
    sget-object v7, Lh0/m;->c:Lh0/m;

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_f
    iget-object v7, v12, Lh0/h;->j:Lh0/o;

    .line 178
    .line 179
    if-eq v8, v7, :cond_10

    .line 180
    .line 181
    sget-object v7, Lh0/m;->d:Lh0/m;

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_10
    sget-object v7, Lh0/m;->b:Lh0/m;

    .line 185
    .line 186
    :goto_4
    sget-object v8, Lh0/m;->c:Lh0/m;

    .line 187
    .line 188
    invoke-static {v7, v8}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_11

    .line 193
    .line 194
    goto/16 :goto_13

    .line 195
    .line 196
    :cond_11
    sget-object v11, Lh0/m;->d:Lh0/m;

    .line 197
    .line 198
    invoke-static {v7, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v11

    .line 202
    if-eqz v11, :cond_12

    .line 203
    .line 204
    invoke-static {v4}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    if-eqz v1, :cond_34

    .line 209
    .line 210
    invoke-interface {v3, v1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Ljava/lang/Boolean;

    .line 215
    .line 216
    return-object v1

    .line 217
    :cond_12
    sget-object v11, Lh0/m;->b:Lh0/m;

    .line 218
    .line 219
    invoke-static {v7, v11}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result v12

    .line 223
    if-nez v12, :cond_29

    .line 224
    .line 225
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    const-string v1, "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"

    .line 229
    .line 230
    if-eq v7, v11, :cond_26

    .line 231
    .line 232
    if-eq v7, v8, :cond_25

    .line 233
    .line 234
    iget-object v1, v7, Lh0/m;->a:LR/e;

    .line 235
    .line 236
    iget v2, v1, LR/e;->s:I

    .line 237
    .line 238
    if-eqz v2, :cond_24

    .line 239
    .line 240
    iget-object v1, v1, LR/e;->q:[Ljava/lang/Object;

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    const/4 v5, 0x0

    .line 244
    :goto_5
    if-ge v4, v2, :cond_23

    .line 245
    .line 246
    aget-object v6, v1, v4

    .line 247
    .line 248
    check-cast v6, LB0/d;

    .line 249
    .line 250
    check-cast v6, Lc0/l;

    .line 251
    .line 252
    iget-object v7, v6, Lc0/l;->q:Lc0/l;

    .line 253
    .line 254
    iget-boolean v7, v7, Lc0/l;->D:Z

    .line 255
    .line 256
    if-nez v7, :cond_13

    .line 257
    .line 258
    const-string v7, "visitChildren called on an unattached node"

    .line 259
    .line 260
    invoke-static {v7}, Ly0/a;->b(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_13
    new-instance v7, LR/e;

    .line 264
    .line 265
    const/16 v8, 0x10

    .line 266
    .line 267
    new-array v9, v8, [Lc0/l;

    .line 268
    .line 269
    invoke-direct {v7, v9}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    iget-object v6, v6, Lc0/l;->q:Lc0/l;

    .line 273
    .line 274
    iget-object v8, v6, Lc0/l;->v:Lc0/l;

    .line 275
    .line 276
    if-nez v8, :cond_14

    .line 277
    .line 278
    invoke-static {v7, v6}, LB0/g;->b(LR/e;Lc0/l;)V

    .line 279
    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_14
    invoke-virtual {v7, v8}, LR/e;->c(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_15
    :goto_6
    iget v6, v7, LR/e;->s:I

    .line 286
    .line 287
    if-eqz v6, :cond_22

    .line 288
    .line 289
    add-int/lit8 v6, v6, -0x1

    .line 290
    .line 291
    invoke-virtual {v7, v6}, LR/e;->m(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    check-cast v6, Lc0/l;

    .line 296
    .line 297
    iget v8, v6, Lc0/l;->t:I

    .line 298
    .line 299
    and-int/lit16 v8, v8, 0x400

    .line 300
    .line 301
    if-nez v8, :cond_16

    .line 302
    .line 303
    invoke-static {v7, v6}, LB0/g;->b(LR/e;Lc0/l;)V

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_16
    :goto_7
    if-eqz v6, :cond_15

    .line 308
    .line 309
    iget v8, v6, Lc0/l;->s:I

    .line 310
    .line 311
    and-int/lit16 v8, v8, 0x400

    .line 312
    .line 313
    if-eqz v8, :cond_21

    .line 314
    .line 315
    move-object/from16 v8, v16

    .line 316
    .line 317
    :goto_8
    if-eqz v6, :cond_15

    .line 318
    .line 319
    instance-of v9, v6, Lh0/o;

    .line 320
    .line 321
    if-eqz v9, :cond_18

    .line 322
    .line 323
    check-cast v6, Lh0/o;

    .line 324
    .line 325
    invoke-virtual {v6}, Lh0/o;->y0()Lh0/k;

    .line 326
    .line 327
    .line 328
    move-result-object v9

    .line 329
    iget-boolean v9, v9, Lh0/k;->a:Z

    .line 330
    .line 331
    if-eqz v9, :cond_17

    .line 332
    .line 333
    invoke-interface {v3, v6}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    check-cast v6, Ljava/lang/Boolean;

    .line 338
    .line 339
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    goto :goto_9

    .line 344
    :cond_17
    invoke-static {v6, v15, v3}, Lh0/d;->i(Lh0/o;ILB5/c;)Z

    .line 345
    .line 346
    .line 347
    move-result v6

    .line 348
    :goto_9
    if-eqz v6, :cond_20

    .line 349
    .line 350
    move v5, v14

    .line 351
    goto :goto_e

    .line 352
    :cond_18
    iget v9, v6, Lc0/l;->s:I

    .line 353
    .line 354
    and-int/lit16 v9, v9, 0x400

    .line 355
    .line 356
    if-eqz v9, :cond_19

    .line 357
    .line 358
    move v9, v14

    .line 359
    goto :goto_a

    .line 360
    :cond_19
    const/4 v9, 0x0

    .line 361
    :goto_a
    if-eqz v9, :cond_20

    .line 362
    .line 363
    instance-of v9, v6, LB0/n;

    .line 364
    .line 365
    if-eqz v9, :cond_20

    .line 366
    .line 367
    move-object v9, v6

    .line 368
    check-cast v9, LB0/n;

    .line 369
    .line 370
    iget-object v9, v9, LB0/n;->F:Lc0/l;

    .line 371
    .line 372
    const/4 v10, 0x0

    .line 373
    :goto_b
    if-eqz v9, :cond_1f

    .line 374
    .line 375
    iget v11, v9, Lc0/l;->s:I

    .line 376
    .line 377
    and-int/lit16 v11, v11, 0x400

    .line 378
    .line 379
    if-eqz v11, :cond_1a

    .line 380
    .line 381
    move v11, v14

    .line 382
    goto :goto_c

    .line 383
    :cond_1a
    const/4 v11, 0x0

    .line 384
    :goto_c
    if-eqz v11, :cond_1e

    .line 385
    .line 386
    add-int/lit8 v10, v10, 0x1

    .line 387
    .line 388
    if-ne v10, v14, :cond_1b

    .line 389
    .line 390
    move-object v6, v9

    .line 391
    goto :goto_d

    .line 392
    :cond_1b
    if-nez v8, :cond_1c

    .line 393
    .line 394
    new-instance v8, LR/e;

    .line 395
    .line 396
    const/16 v11, 0x10

    .line 397
    .line 398
    new-array v12, v11, [Lc0/l;

    .line 399
    .line 400
    invoke-direct {v8, v12}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    :cond_1c
    if-eqz v6, :cond_1d

    .line 404
    .line 405
    invoke-virtual {v8, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    move-object/from16 v6, v16

    .line 409
    .line 410
    :cond_1d
    invoke-virtual {v8, v9}, LR/e;->c(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    :cond_1e
    :goto_d
    iget-object v9, v9, Lc0/l;->v:Lc0/l;

    .line 414
    .line 415
    goto :goto_b

    .line 416
    :cond_1f
    if-ne v10, v14, :cond_20

    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_20
    invoke-static {v8}, LB0/g;->f(LR/e;)Lc0/l;

    .line 420
    .line 421
    .line 422
    move-result-object v6

    .line 423
    goto :goto_8

    .line 424
    :cond_21
    iget-object v6, v6, Lc0/l;->v:Lc0/l;

    .line 425
    .line 426
    goto :goto_7

    .line 427
    :cond_22
    :goto_e
    add-int/lit8 v4, v4, 0x1

    .line 428
    .line 429
    goto/16 :goto_5

    .line 430
    .line 431
    :cond_23
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 432
    .line 433
    .line 434
    move-result-object v1

    .line 435
    return-object v1

    .line 436
    :cond_24
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 437
    .line 438
    const-string v2, "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"

    .line 439
    .line 440
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    throw v1

    .line 444
    :cond_25
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 445
    .line 446
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    throw v2

    .line 450
    :cond_26
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 451
    .line 452
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    throw v2

    .line 456
    :cond_27
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 457
    .line 458
    const-string v2, "invalid FocusDirection"

    .line 459
    .line 460
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    throw v1

    .line 464
    :cond_28
    move-object/from16 v5, v16

    .line 465
    .line 466
    :cond_29
    invoke-virtual {v6}, LC0/u;->get()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    check-cast v6, LW0/l;

    .line 471
    .line 472
    new-instance v7, LA/J;

    .line 473
    .line 474
    invoke-direct {v7, v5, v0, v3}, LA/J;-><init>(Lh0/o;Lh0/h;LB5/c;)V

    .line 475
    .line 476
    .line 477
    if-ne v1, v14, :cond_2a

    .line 478
    .line 479
    goto :goto_f

    .line 480
    :cond_2a
    if-ne v1, v13, :cond_2d

    .line 481
    .line 482
    :goto_f
    if-ne v1, v14, :cond_2b

    .line 483
    .line 484
    invoke-static {v4, v7}, Lh0/d;->k(Lh0/o;LA/J;)Z

    .line 485
    .line 486
    .line 487
    move-result v1

    .line 488
    goto :goto_10

    .line 489
    :cond_2b
    if-ne v1, v13, :cond_2c

    .line 490
    .line 491
    invoke-static {v4, v7}, Lh0/d;->a(Lh0/o;LA/J;)Z

    .line 492
    .line 493
    .line 494
    move-result v1

    .line 495
    :goto_10
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    return-object v1

    .line 500
    :cond_2c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 501
    .line 502
    const-string v2, "This function should only be used for 1-D focus search"

    .line 503
    .line 504
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    throw v1

    .line 508
    :cond_2d
    if-ne v1, v10, :cond_2e

    .line 509
    .line 510
    goto :goto_11

    .line 511
    :cond_2e
    if-ne v1, v9, :cond_2f

    .line 512
    .line 513
    goto :goto_11

    .line 514
    :cond_2f
    const/4 v3, 0x5

    .line 515
    if-ne v1, v3, :cond_30

    .line 516
    .line 517
    goto :goto_11

    .line 518
    :cond_30
    const/4 v3, 0x6

    .line 519
    if-ne v1, v3, :cond_31

    .line 520
    .line 521
    :goto_11
    invoke-static {v1, v7, v4, v2}, Lh0/d;->F(ILA/J;Lh0/o;Li0/c;)Ljava/lang/Boolean;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    return-object v1

    .line 526
    :cond_31
    if-ne v1, v15, :cond_35

    .line 527
    .line 528
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 529
    .line 530
    .line 531
    move-result v1

    .line 532
    if-eqz v1, :cond_33

    .line 533
    .line 534
    if-ne v1, v14, :cond_32

    .line 535
    .line 536
    move v9, v10

    .line 537
    goto :goto_12

    .line 538
    :cond_32
    new-instance v1, LC2/e;

    .line 539
    .line 540
    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    .line 541
    .line 542
    .line 543
    throw v1

    .line 544
    :cond_33
    :goto_12
    invoke-static {v4}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    if-eqz v1, :cond_34

    .line 549
    .line 550
    invoke-static {v9, v7, v1, v2}, Lh0/d;->F(ILA/J;Lh0/o;Li0/c;)Ljava/lang/Boolean;

    .line 551
    .line 552
    .line 553
    move-result-object v1

    .line 554
    return-object v1

    .line 555
    :cond_34
    :goto_13
    return-object v16

    .line 556
    :cond_35
    const/16 v2, 0x8

    .line 557
    .line 558
    if-ne v1, v2, :cond_45

    .line 559
    .line 560
    invoke-static {v4}, Lh0/d;->g(Lh0/o;)Lh0/o;

    .line 561
    .line 562
    .line 563
    move-result-object v1

    .line 564
    if-eqz v1, :cond_42

    .line 565
    .line 566
    iget-object v2, v1, Lc0/l;->q:Lc0/l;

    .line 567
    .line 568
    iget-boolean v2, v2, Lc0/l;->D:Z

    .line 569
    .line 570
    if-nez v2, :cond_36

    .line 571
    .line 572
    const-string v2, "visitAncestors called on an unattached node"

    .line 573
    .line 574
    invoke-static {v2}, Ly0/a;->b(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    :cond_36
    iget-object v2, v1, Lc0/l;->q:Lc0/l;

    .line 578
    .line 579
    iget-object v2, v2, Lc0/l;->u:Lc0/l;

    .line 580
    .line 581
    invoke-static {v1}, LB0/g;->u(LB0/m;)LB0/L;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    :goto_14
    if-eqz v1, :cond_42

    .line 586
    .line 587
    iget-object v3, v1, LB0/L;->U:LB0/g0;

    .line 588
    .line 589
    iget-object v3, v3, LB0/g0;->e:Lc0/l;

    .line 590
    .line 591
    iget v3, v3, Lc0/l;->t:I

    .line 592
    .line 593
    and-int/lit16 v3, v3, 0x400

    .line 594
    .line 595
    if-eqz v3, :cond_40

    .line 596
    .line 597
    :goto_15
    if-eqz v2, :cond_40

    .line 598
    .line 599
    iget v3, v2, Lc0/l;->s:I

    .line 600
    .line 601
    and-int/lit16 v3, v3, 0x400

    .line 602
    .line 603
    if-eqz v3, :cond_3f

    .line 604
    .line 605
    move-object v3, v2

    .line 606
    move-object/from16 v5, v16

    .line 607
    .line 608
    :goto_16
    if-eqz v3, :cond_3f

    .line 609
    .line 610
    instance-of v6, v3, Lh0/o;

    .line 611
    .line 612
    if-eqz v6, :cond_38

    .line 613
    .line 614
    check-cast v3, Lh0/o;

    .line 615
    .line 616
    invoke-virtual {v3}, Lh0/o;->y0()Lh0/k;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    iget-boolean v6, v6, Lh0/k;->a:Z

    .line 621
    .line 622
    if-eqz v6, :cond_37

    .line 623
    .line 624
    move-object/from16 v16, v3

    .line 625
    .line 626
    goto/16 :goto_1b

    .line 627
    .line 628
    :cond_37
    const/16 v11, 0x10

    .line 629
    .line 630
    goto :goto_1a

    .line 631
    :cond_38
    iget v6, v3, Lc0/l;->s:I

    .line 632
    .line 633
    and-int/lit16 v6, v6, 0x400

    .line 634
    .line 635
    if-eqz v6, :cond_37

    .line 636
    .line 637
    instance-of v6, v3, LB0/n;

    .line 638
    .line 639
    if-eqz v6, :cond_37

    .line 640
    .line 641
    move-object v6, v3

    .line 642
    check-cast v6, LB0/n;

    .line 643
    .line 644
    iget-object v6, v6, LB0/n;->F:Lc0/l;

    .line 645
    .line 646
    const/4 v8, 0x0

    .line 647
    :goto_17
    if-eqz v6, :cond_3d

    .line 648
    .line 649
    iget v9, v6, Lc0/l;->s:I

    .line 650
    .line 651
    and-int/lit16 v9, v9, 0x400

    .line 652
    .line 653
    if-eqz v9, :cond_39

    .line 654
    .line 655
    add-int/lit8 v8, v8, 0x1

    .line 656
    .line 657
    if-ne v8, v14, :cond_3a

    .line 658
    .line 659
    move-object v3, v6

    .line 660
    :cond_39
    const/16 v11, 0x10

    .line 661
    .line 662
    goto :goto_19

    .line 663
    :cond_3a
    if-nez v5, :cond_3b

    .line 664
    .line 665
    new-instance v5, LR/e;

    .line 666
    .line 667
    const/16 v11, 0x10

    .line 668
    .line 669
    new-array v9, v11, [Lc0/l;

    .line 670
    .line 671
    invoke-direct {v5, v9}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 672
    .line 673
    .line 674
    goto :goto_18

    .line 675
    :cond_3b
    const/16 v11, 0x10

    .line 676
    .line 677
    :goto_18
    if-eqz v3, :cond_3c

    .line 678
    .line 679
    invoke-virtual {v5, v3}, LR/e;->c(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    move-object/from16 v3, v16

    .line 683
    .line 684
    :cond_3c
    invoke-virtual {v5, v6}, LR/e;->c(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    :goto_19
    iget-object v6, v6, Lc0/l;->v:Lc0/l;

    .line 688
    .line 689
    goto :goto_17

    .line 690
    :cond_3d
    const/16 v11, 0x10

    .line 691
    .line 692
    if-ne v8, v14, :cond_3e

    .line 693
    .line 694
    goto :goto_16

    .line 695
    :cond_3e
    :goto_1a
    invoke-static {v5}, LB0/g;->f(LR/e;)Lc0/l;

    .line 696
    .line 697
    .line 698
    move-result-object v3

    .line 699
    goto :goto_16

    .line 700
    :cond_3f
    const/16 v11, 0x10

    .line 701
    .line 702
    iget-object v2, v2, Lc0/l;->u:Lc0/l;

    .line 703
    .line 704
    goto :goto_15

    .line 705
    :cond_40
    const/16 v11, 0x10

    .line 706
    .line 707
    invoke-virtual {v1}, LB0/L;->s()LB0/L;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    if-eqz v1, :cond_41

    .line 712
    .line 713
    iget-object v2, v1, LB0/L;->U:LB0/g0;

    .line 714
    .line 715
    if-eqz v2, :cond_41

    .line 716
    .line 717
    iget-object v2, v2, LB0/g0;->d:LB0/B0;

    .line 718
    .line 719
    goto/16 :goto_14

    .line 720
    .line 721
    :cond_41
    move-object/from16 v2, v16

    .line 722
    .line 723
    goto/16 :goto_14

    .line 724
    .line 725
    :cond_42
    :goto_1b
    move-object/from16 v1, v16

    .line 726
    .line 727
    if-eqz v1, :cond_44

    .line 728
    .line 729
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    if-eqz v2, :cond_43

    .line 734
    .line 735
    goto :goto_1c

    .line 736
    :cond_43
    invoke-virtual {v7, v1}, LA/J;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    check-cast v1, Ljava/lang/Boolean;

    .line 741
    .line 742
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 743
    .line 744
    .line 745
    move-result v6

    .line 746
    goto :goto_1d

    .line 747
    :cond_44
    :goto_1c
    const/4 v6, 0x0

    .line 748
    :goto_1d
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    return-object v1

    .line 753
    :cond_45
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 754
    .line 755
    new-instance v3, Ljava/lang/StringBuilder;

    .line 756
    .line 757
    const-string v4, "Focus search invoked with invalid FocusDirection "

    .line 758
    .line 759
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-static {v1}, Lh0/c;->a(I)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 767
    .line 768
    .line 769
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v1

    .line 773
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v1

    .line 777
    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 778
    .line 779
    .line 780
    throw v2
.end method

.method public final e(Lh0/o;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lh0/h;->j:Lh0/o;

    .line 2
    .line 3
    iput-object p1, p0, Lh0/h;->j:Lh0/o;

    .line 4
    .line 5
    iget-object v1, p0, Lh0/h;->i:Lr/C;

    .line 6
    .line 7
    iget-object v2, v1, Lr/C;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    iget v1, v1, Lr/C;->b:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :goto_0
    if-ge v3, v1, :cond_2

    .line 13
    .line 14
    aget-object v4, v2, v3

    .line 15
    .line 16
    check-cast v4, Ld0/b;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-static {v0}, LB0/g;->u(LB0/m;)LB0/L;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    if-eqz v6, :cond_0

    .line 29
    .line 30
    invoke-virtual {v6}, LB0/L;->u()LI0/i;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    if-eqz v7, :cond_0

    .line 35
    .line 36
    iget-object v7, v7, LI0/i;->q:Lr/G;

    .line 37
    .line 38
    sget-object v8, LI0/h;->g:LI0/s;

    .line 39
    .line 40
    invoke-virtual {v7, v8}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-ne v7, v5, :cond_0

    .line 45
    .line 46
    iget-object v7, v4, Ld0/b;->a:Lk3/d;

    .line 47
    .line 48
    iget-object v8, v4, Ld0/b;->c:LC0/A;

    .line 49
    .line 50
    iget v6, v6, LB0/L;->r:I

    .line 51
    .line 52
    iget-object v7, v7, Lk3/d;->r:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v7, Landroid/view/autofill/AutofillManager;

    .line 55
    .line 56
    invoke-static {v7, v8, v6}, Lcom/google/firebase/c;->w(Landroid/view/autofill/AutofillManager;LC0/A;I)V

    .line 57
    .line 58
    .line 59
    :cond_0
    if-eqz p1, :cond_1

    .line 60
    .line 61
    invoke-static {p1}, LB0/g;->u(LB0/m;)LB0/L;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    if-eqz v6, :cond_1

    .line 66
    .line 67
    invoke-virtual {v6}, LB0/L;->u()LI0/i;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    iget-object v7, v7, LI0/i;->q:Lr/G;

    .line 74
    .line 75
    sget-object v8, LI0/h;->g:LI0/s;

    .line 76
    .line 77
    invoke-virtual {v7, v8}, Lr/G;->b(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-ne v7, v5, :cond_1

    .line 82
    .line 83
    iget v5, v6, LB0/L;->r:I

    .line 84
    .line 85
    iget-object v6, v4, Ld0/b;->d:LJ0/a;

    .line 86
    .line 87
    iget-object v6, v6, LJ0/a;->a:LE/Y;

    .line 88
    .line 89
    new-instance v7, Ld0/a;

    .line 90
    .line 91
    invoke-direct {v7, v4, v5}, Ld0/a;-><init>(Ld0/b;I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6, v5, v7}, LE/Y;->s(ILB5/g;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    return-void
.end method

.method public final f(Landroid/view/KeyEvent;)Z
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, LQ2/g;->d(I)J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-static/range {p1 .. p1}, LE3/h;->C(Landroid/view/KeyEvent;)I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x2

    .line 16
    const v10, -0x3361d2af    # -8.2930312E7f

    .line 17
    .line 18
    .line 19
    const-wide/16 v15, 0x0

    .line 20
    .line 21
    const-wide v17, 0x101010101010101L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide/16 v19, 0xfe

    .line 27
    .line 28
    const/16 p1, 0x6

    .line 29
    .line 30
    const/16 v5, 0x8

    .line 31
    .line 32
    const/16 v21, 0x0

    .line 33
    .line 34
    const-wide/16 v22, 0x1

    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x1

    .line 38
    if-ne v3, v4, :cond_11

    .line 39
    .line 40
    iget-object v3, v0, Lh0/h;->h:Lr/z;

    .line 41
    .line 42
    if-nez v3, :cond_0

    .line 43
    .line 44
    new-instance v3, Lr/z;

    .line 45
    .line 46
    invoke-direct {v3, v6}, Lr/z;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object v3, v0, Lh0/h;->h:Lr/z;

    .line 50
    .line 51
    :cond_0
    move-object v4, v3

    .line 52
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    mul-int/2addr v3, v10

    .line 57
    shl-int/lit8 v24, v3, 0x10

    .line 58
    .line 59
    xor-int v3, v3, v24

    .line 60
    .line 61
    move/from16 v24, v6

    .line 62
    .line 63
    ushr-int/lit8 v6, v3, 0x7

    .line 64
    .line 65
    and-int/lit8 v3, v3, 0x7f

    .line 66
    .line 67
    const/16 v25, 0x3f

    .line 68
    .line 69
    iget v8, v4, Lr/z;->c:I

    .line 70
    .line 71
    and-int v26, v6, v8

    .line 72
    .line 73
    move/from16 v27, v21

    .line 74
    .line 75
    const/16 v28, 0x7

    .line 76
    .line 77
    :goto_0
    iget-object v9, v4, Lr/z;->a:[J

    .line 78
    .line 79
    shr-int/lit8 v29, v26, 0x3

    .line 80
    .line 81
    and-int/lit8 v30, v26, 0x7

    .line 82
    .line 83
    move/from16 v31, v10

    .line 84
    .line 85
    shl-int/lit8 v10, v30, 0x3

    .line 86
    .line 87
    aget-wide v32, v9, v29

    .line 88
    .line 89
    ushr-long v32, v32, v10

    .line 90
    .line 91
    add-int/lit8 v29, v29, 0x1

    .line 92
    .line 93
    aget-wide v29, v9, v29

    .line 94
    .line 95
    rsub-int/lit8 v9, v10, 0x40

    .line 96
    .line 97
    shl-long v29, v29, v9

    .line 98
    .line 99
    int-to-long v9, v10

    .line 100
    neg-long v9, v9

    .line 101
    shr-long v9, v9, v25

    .line 102
    .line 103
    and-long v9, v29, v9

    .line 104
    .line 105
    or-long v9, v32, v9

    .line 106
    .line 107
    const-wide/16 v29, 0xff

    .line 108
    .line 109
    int-to-long v11, v3

    .line 110
    mul-long v32, v11, v17

    .line 111
    .line 112
    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    xor-long v13, v9, v32

    .line 118
    .line 119
    sub-long v32, v13, v17

    .line 120
    .line 121
    not-long v13, v13

    .line 122
    and-long v13, v32, v13

    .line 123
    .line 124
    and-long v13, v13, v34

    .line 125
    .line 126
    :goto_1
    cmp-long v32, v13, v15

    .line 127
    .line 128
    if-eqz v32, :cond_2

    .line 129
    .line 130
    invoke-static {v13, v14}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 131
    .line 132
    .line 133
    move-result v32

    .line 134
    shr-int/lit8 v32, v32, 0x3

    .line 135
    .line 136
    add-int v32, v26, v32

    .line 137
    .line 138
    and-int v32, v32, v8

    .line 139
    .line 140
    move-wide/from16 v36, v15

    .line 141
    .line 142
    iget-object v15, v4, Lr/z;->b:[J

    .line 143
    .line 144
    aget-wide v38, v15, v32

    .line 145
    .line 146
    cmp-long v15, v38, v1

    .line 147
    .line 148
    if-nez v15, :cond_1

    .line 149
    .line 150
    move/from16 v33, v7

    .line 151
    .line 152
    goto/16 :goto_d

    .line 153
    .line 154
    :cond_1
    sub-long v15, v13, v22

    .line 155
    .line 156
    and-long/2addr v13, v15

    .line 157
    move-wide/from16 v15, v36

    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_2
    move-wide/from16 v36, v15

    .line 161
    .line 162
    not-long v13, v9

    .line 163
    shl-long v13, v13, p1

    .line 164
    .line 165
    and-long/2addr v9, v13

    .line 166
    and-long v9, v9, v34

    .line 167
    .line 168
    cmp-long v9, v9, v36

    .line 169
    .line 170
    if-eqz v9, :cond_10

    .line 171
    .line 172
    invoke-virtual {v4, v6}, Lr/z;->b(I)I

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    iget v8, v4, Lr/z;->e:I

    .line 177
    .line 178
    if-nez v8, :cond_3

    .line 179
    .line 180
    iget-object v8, v4, Lr/z;->a:[J

    .line 181
    .line 182
    shr-int/lit8 v13, v3, 0x3

    .line 183
    .line 184
    aget-wide v13, v8, v13

    .line 185
    .line 186
    and-int/lit8 v8, v3, 0x7

    .line 187
    .line 188
    shl-int/lit8 v8, v8, 0x3

    .line 189
    .line 190
    shr-long/2addr v13, v8

    .line 191
    and-long v13, v13, v29

    .line 192
    .line 193
    cmp-long v8, v13, v19

    .line 194
    .line 195
    if-nez v8, :cond_4

    .line 196
    .line 197
    :cond_3
    move/from16 v33, v7

    .line 198
    .line 199
    const-wide/16 v22, 0x80

    .line 200
    .line 201
    goto/16 :goto_c

    .line 202
    .line 203
    :cond_4
    iget v3, v4, Lr/z;->c:I

    .line 204
    .line 205
    if-le v3, v5, :cond_d

    .line 206
    .line 207
    iget v8, v4, Lr/z;->d:I

    .line 208
    .line 209
    int-to-long v13, v8

    .line 210
    const-wide/16 v15, 0x20

    .line 211
    .line 212
    mul-long/2addr v13, v15

    .line 213
    const-wide/16 v15, 0x80

    .line 214
    .line 215
    int-to-long v9, v3

    .line 216
    const-wide/16 v17, 0x19

    .line 217
    .line 218
    mul-long v9, v9, v17

    .line 219
    .line 220
    const-wide/high16 v17, -0x8000000000000000L

    .line 221
    .line 222
    xor-long v13, v13, v17

    .line 223
    .line 224
    xor-long v8, v9, v17

    .line 225
    .line 226
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Long;->compare(JJ)I

    .line 227
    .line 228
    .line 229
    move-result v3

    .line 230
    if-gtz v3, :cond_c

    .line 231
    .line 232
    iget-object v3, v4, Lr/z;->a:[J

    .line 233
    .line 234
    iget v8, v4, Lr/z;->c:I

    .line 235
    .line 236
    iget-object v9, v4, Lr/z;->b:[J

    .line 237
    .line 238
    add-int/lit8 v10, v8, 0x7

    .line 239
    .line 240
    shr-int/lit8 v10, v10, 0x3

    .line 241
    .line 242
    move/from16 v13, v21

    .line 243
    .line 244
    :goto_2
    if-ge v13, v10, :cond_5

    .line 245
    .line 246
    aget-wide v22, v3, v13

    .line 247
    .line 248
    move v14, v5

    .line 249
    move/from16 v32, v6

    .line 250
    .line 251
    and-long v5, v22, v34

    .line 252
    .line 253
    move-wide/from16 v22, v15

    .line 254
    .line 255
    move/from16 v16, v14

    .line 256
    .line 257
    not-long v14, v5

    .line 258
    ushr-long v5, v5, v28

    .line 259
    .line 260
    add-long/2addr v14, v5

    .line 261
    const-wide v5, -0x101010101010102L

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    and-long/2addr v5, v14

    .line 267
    aput-wide v5, v3, v13

    .line 268
    .line 269
    add-int/lit8 v13, v13, 0x1

    .line 270
    .line 271
    move/from16 v5, v16

    .line 272
    .line 273
    move-wide/from16 v15, v22

    .line 274
    .line 275
    move/from16 v6, v32

    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_5
    move/from16 v32, v6

    .line 279
    .line 280
    move-wide/from16 v22, v15

    .line 281
    .line 282
    move/from16 v16, v5

    .line 283
    .line 284
    invoke-static {v3}, Ln5/k;->O0([J)I

    .line 285
    .line 286
    .line 287
    move-result v5

    .line 288
    add-int/lit8 v6, v5, -0x1

    .line 289
    .line 290
    aget-wide v13, v3, v6

    .line 291
    .line 292
    const-wide v25, 0xffffffffffffffL

    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    and-long v13, v13, v25

    .line 298
    .line 299
    const-wide/high16 v33, -0x100000000000000L

    .line 300
    .line 301
    or-long v13, v13, v33

    .line 302
    .line 303
    aput-wide v13, v3, v6

    .line 304
    .line 305
    aget-wide v13, v3, v21

    .line 306
    .line 307
    aput-wide v13, v3, v5

    .line 308
    .line 309
    move/from16 v5, v21

    .line 310
    .line 311
    :goto_3
    if-eq v5, v8, :cond_a

    .line 312
    .line 313
    shr-int/lit8 v6, v5, 0x3

    .line 314
    .line 315
    aget-wide v13, v3, v6

    .line 316
    .line 317
    and-int/lit8 v10, v5, 0x7

    .line 318
    .line 319
    shl-int/lit8 v10, v10, 0x3

    .line 320
    .line 321
    shr-long/2addr v13, v10

    .line 322
    and-long v13, v13, v29

    .line 323
    .line 324
    cmp-long v15, v13, v22

    .line 325
    .line 326
    if-nez v15, :cond_6

    .line 327
    .line 328
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_6
    cmp-long v13, v13, v19

    .line 332
    .line 333
    if-eqz v13, :cond_7

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_7
    aget-wide v13, v9, v5

    .line 337
    .line 338
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 339
    .line 340
    .line 341
    move-result v13

    .line 342
    mul-int v13, v13, v31

    .line 343
    .line 344
    shl-int/lit8 v14, v13, 0x10

    .line 345
    .line 346
    xor-int/2addr v13, v14

    .line 347
    ushr-int/lit8 v14, v13, 0x7

    .line 348
    .line 349
    invoke-virtual {v4, v14}, Lr/z;->b(I)I

    .line 350
    .line 351
    .line 352
    move-result v15

    .line 353
    and-int/2addr v14, v8

    .line 354
    sub-int v27, v15, v14

    .line 355
    .line 356
    and-int v27, v27, v8

    .line 357
    .line 358
    move/from16 v33, v7

    .line 359
    .line 360
    div-int/lit8 v7, v27, 0x8

    .line 361
    .line 362
    sub-int v14, v5, v14

    .line 363
    .line 364
    and-int/2addr v14, v8

    .line 365
    div-int/lit8 v14, v14, 0x8

    .line 366
    .line 367
    if-ne v7, v14, :cond_8

    .line 368
    .line 369
    and-int/lit8 v7, v13, 0x7f

    .line 370
    .line 371
    int-to-long v13, v7

    .line 372
    aget-wide v34, v3, v6

    .line 373
    .line 374
    move v7, v5

    .line 375
    move/from16 p1, v6

    .line 376
    .line 377
    shl-long v5, v29, v10

    .line 378
    .line 379
    not-long v5, v5

    .line 380
    and-long v5, v34, v5

    .line 381
    .line 382
    shl-long/2addr v13, v10

    .line 383
    or-long/2addr v5, v13

    .line 384
    aput-wide v5, v3, p1

    .line 385
    .line 386
    array-length v5, v3

    .line 387
    add-int/lit8 v5, v5, -0x1

    .line 388
    .line 389
    aget-wide v13, v3, v21

    .line 390
    .line 391
    and-long v13, v13, v25

    .line 392
    .line 393
    or-long v13, v13, v17

    .line 394
    .line 395
    aput-wide v13, v3, v5

    .line 396
    .line 397
    add-int/lit8 v5, v7, 0x1

    .line 398
    .line 399
    :goto_5
    move/from16 v7, v33

    .line 400
    .line 401
    goto :goto_3

    .line 402
    :cond_8
    move v7, v5

    .line 403
    move/from16 p1, v6

    .line 404
    .line 405
    shr-int/lit8 v5, v15, 0x3

    .line 406
    .line 407
    aget-wide v34, v3, v5

    .line 408
    .line 409
    and-int/lit8 v6, v15, 0x7

    .line 410
    .line 411
    shl-int/lit8 v6, v6, 0x3

    .line 412
    .line 413
    shr-long v38, v34, v6

    .line 414
    .line 415
    and-long v38, v38, v29

    .line 416
    .line 417
    cmp-long v14, v38, v22

    .line 418
    .line 419
    if-nez v14, :cond_9

    .line 420
    .line 421
    and-int/lit8 v13, v13, 0x7f

    .line 422
    .line 423
    int-to-long v13, v13

    .line 424
    move/from16 v27, v5

    .line 425
    .line 426
    move/from16 v38, v6

    .line 427
    .line 428
    shl-long v5, v29, v38

    .line 429
    .line 430
    not-long v5, v5

    .line 431
    and-long v5, v34, v5

    .line 432
    .line 433
    shl-long v13, v13, v38

    .line 434
    .line 435
    or-long/2addr v5, v13

    .line 436
    aput-wide v5, v3, v27

    .line 437
    .line 438
    aget-wide v5, v3, p1

    .line 439
    .line 440
    shl-long v13, v29, v10

    .line 441
    .line 442
    not-long v13, v13

    .line 443
    and-long/2addr v5, v13

    .line 444
    shl-long v13, v22, v10

    .line 445
    .line 446
    or-long/2addr v5, v13

    .line 447
    aput-wide v5, v3, p1

    .line 448
    .line 449
    aget-wide v5, v9, v7

    .line 450
    .line 451
    aput-wide v5, v9, v15

    .line 452
    .line 453
    aput-wide v36, v9, v7

    .line 454
    .line 455
    move v5, v7

    .line 456
    goto :goto_6

    .line 457
    :cond_9
    move/from16 v27, v5

    .line 458
    .line 459
    move/from16 v38, v6

    .line 460
    .line 461
    and-int/lit8 v5, v13, 0x7f

    .line 462
    .line 463
    int-to-long v5, v5

    .line 464
    shl-long v13, v29, v38

    .line 465
    .line 466
    not-long v13, v13

    .line 467
    and-long v13, v34, v13

    .line 468
    .line 469
    shl-long v5, v5, v38

    .line 470
    .line 471
    or-long/2addr v5, v13

    .line 472
    aput-wide v5, v3, v27

    .line 473
    .line 474
    aget-wide v5, v9, v15

    .line 475
    .line 476
    aget-wide v13, v9, v7

    .line 477
    .line 478
    aput-wide v13, v9, v15

    .line 479
    .line 480
    aput-wide v5, v9, v7

    .line 481
    .line 482
    add-int/lit8 v5, v7, -0x1

    .line 483
    .line 484
    :goto_6
    array-length v6, v3

    .line 485
    add-int/lit8 v6, v6, -0x1

    .line 486
    .line 487
    aget-wide v13, v3, v21

    .line 488
    .line 489
    and-long v13, v13, v25

    .line 490
    .line 491
    or-long v13, v13, v17

    .line 492
    .line 493
    aput-wide v13, v3, v6

    .line 494
    .line 495
    add-int/lit8 v5, v5, 0x1

    .line 496
    .line 497
    goto :goto_5

    .line 498
    :cond_a
    move/from16 v33, v7

    .line 499
    .line 500
    iget v3, v4, Lr/z;->c:I

    .line 501
    .line 502
    invoke-static {v3}, Lr/O;->a(I)I

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    iget v5, v4, Lr/z;->d:I

    .line 507
    .line 508
    sub-int/2addr v3, v5

    .line 509
    iput v3, v4, Lr/z;->e:I

    .line 510
    .line 511
    :cond_b
    move/from16 v5, v32

    .line 512
    .line 513
    goto/16 :goto_b

    .line 514
    .line 515
    :cond_c
    move-wide/from16 v22, v15

    .line 516
    .line 517
    :goto_7
    move/from16 v32, v6

    .line 518
    .line 519
    move/from16 v33, v7

    .line 520
    .line 521
    goto :goto_8

    .line 522
    :cond_d
    const-wide/16 v22, 0x80

    .line 523
    .line 524
    goto :goto_7

    .line 525
    :goto_8
    iget v3, v4, Lr/z;->c:I

    .line 526
    .line 527
    invoke-static {v3}, Lr/O;->c(I)I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    iget-object v5, v4, Lr/z;->a:[J

    .line 532
    .line 533
    iget-object v6, v4, Lr/z;->b:[J

    .line 534
    .line 535
    iget v7, v4, Lr/z;->c:I

    .line 536
    .line 537
    invoke-virtual {v4, v3}, Lr/z;->c(I)V

    .line 538
    .line 539
    .line 540
    iget-object v3, v4, Lr/z;->a:[J

    .line 541
    .line 542
    iget-object v8, v4, Lr/z;->b:[J

    .line 543
    .line 544
    iget v9, v4, Lr/z;->c:I

    .line 545
    .line 546
    move/from16 v10, v21

    .line 547
    .line 548
    :goto_9
    if-ge v10, v7, :cond_b

    .line 549
    .line 550
    shr-int/lit8 v13, v10, 0x3

    .line 551
    .line 552
    aget-wide v13, v5, v13

    .line 553
    .line 554
    and-int/lit8 v15, v10, 0x7

    .line 555
    .line 556
    shl-int/lit8 v15, v15, 0x3

    .line 557
    .line 558
    shr-long/2addr v13, v15

    .line 559
    and-long v13, v13, v29

    .line 560
    .line 561
    cmp-long v13, v13, v22

    .line 562
    .line 563
    if-gez v13, :cond_e

    .line 564
    .line 565
    aget-wide v13, v6, v10

    .line 566
    .line 567
    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    .line 568
    .line 569
    .line 570
    move-result v15

    .line 571
    mul-int v15, v15, v31

    .line 572
    .line 573
    shl-int/lit8 v16, v15, 0x10

    .line 574
    .line 575
    xor-int v15, v15, v16

    .line 576
    .line 577
    move-object/from16 v16, v3

    .line 578
    .line 579
    ushr-int/lit8 v3, v15, 0x7

    .line 580
    .line 581
    invoke-virtual {v4, v3}, Lr/z;->b(I)I

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    and-int/lit8 v15, v15, 0x7f

    .line 586
    .line 587
    move-object/from16 v17, v5

    .line 588
    .line 589
    move-object/from16 v18, v6

    .line 590
    .line 591
    int-to-long v5, v15

    .line 592
    shr-int/lit8 v15, v3, 0x3

    .line 593
    .line 594
    and-int/lit8 v19, v3, 0x7

    .line 595
    .line 596
    shl-int/lit8 v19, v19, 0x3

    .line 597
    .line 598
    aget-wide v25, v16, v15

    .line 599
    .line 600
    move-wide/from16 v34, v5

    .line 601
    .line 602
    shl-long v5, v29, v19

    .line 603
    .line 604
    not-long v5, v5

    .line 605
    and-long v5, v25, v5

    .line 606
    .line 607
    shl-long v19, v34, v19

    .line 608
    .line 609
    or-long v5, v5, v19

    .line 610
    .line 611
    aput-wide v5, v16, v15

    .line 612
    .line 613
    add-int/lit8 v15, v3, -0x7

    .line 614
    .line 615
    and-int/2addr v15, v9

    .line 616
    and-int/lit8 v19, v9, 0x7

    .line 617
    .line 618
    add-int v15, v15, v19

    .line 619
    .line 620
    shr-int/lit8 v15, v15, 0x3

    .line 621
    .line 622
    aput-wide v5, v16, v15

    .line 623
    .line 624
    aput-wide v13, v8, v3

    .line 625
    .line 626
    goto :goto_a

    .line 627
    :cond_e
    move-object/from16 v16, v3

    .line 628
    .line 629
    move-object/from16 v17, v5

    .line 630
    .line 631
    move-object/from16 v18, v6

    .line 632
    .line 633
    :goto_a
    add-int/lit8 v10, v10, 0x1

    .line 634
    .line 635
    move-object/from16 v3, v16

    .line 636
    .line 637
    move-object/from16 v5, v17

    .line 638
    .line 639
    move-object/from16 v6, v18

    .line 640
    .line 641
    goto :goto_9

    .line 642
    :goto_b
    invoke-virtual {v4, v5}, Lr/z;->b(I)I

    .line 643
    .line 644
    .line 645
    move-result v3

    .line 646
    :goto_c
    move/from16 v32, v3

    .line 647
    .line 648
    iget v3, v4, Lr/z;->d:I

    .line 649
    .line 650
    add-int/lit8 v3, v3, 0x1

    .line 651
    .line 652
    iput v3, v4, Lr/z;->d:I

    .line 653
    .line 654
    iget v3, v4, Lr/z;->e:I

    .line 655
    .line 656
    iget-object v5, v4, Lr/z;->a:[J

    .line 657
    .line 658
    shr-int/lit8 v6, v32, 0x3

    .line 659
    .line 660
    aget-wide v7, v5, v6

    .line 661
    .line 662
    and-int/lit8 v9, v32, 0x7

    .line 663
    .line 664
    shl-int/lit8 v9, v9, 0x3

    .line 665
    .line 666
    shr-long v13, v7, v9

    .line 667
    .line 668
    and-long v13, v13, v29

    .line 669
    .line 670
    cmp-long v10, v13, v22

    .line 671
    .line 672
    if-nez v10, :cond_f

    .line 673
    .line 674
    move/from16 v21, v33

    .line 675
    .line 676
    :cond_f
    sub-int v3, v3, v21

    .line 677
    .line 678
    iput v3, v4, Lr/z;->e:I

    .line 679
    .line 680
    iget v3, v4, Lr/z;->c:I

    .line 681
    .line 682
    shl-long v13, v29, v9

    .line 683
    .line 684
    not-long v13, v13

    .line 685
    and-long/2addr v7, v13

    .line 686
    shl-long v9, v11, v9

    .line 687
    .line 688
    or-long/2addr v7, v9

    .line 689
    aput-wide v7, v5, v6

    .line 690
    .line 691
    add-int/lit8 v6, v32, -0x7

    .line 692
    .line 693
    and-int/2addr v6, v3

    .line 694
    and-int/lit8 v3, v3, 0x7

    .line 695
    .line 696
    add-int/2addr v6, v3

    .line 697
    shr-int/lit8 v3, v6, 0x3

    .line 698
    .line 699
    aput-wide v7, v5, v3

    .line 700
    .line 701
    :goto_d
    iget-object v3, v4, Lr/z;->b:[J

    .line 702
    .line 703
    aput-wide v1, v3, v32

    .line 704
    .line 705
    return v33

    .line 706
    :cond_10
    move/from16 v16, v5

    .line 707
    .line 708
    move v5, v6

    .line 709
    move/from16 v33, v7

    .line 710
    .line 711
    add-int/lit8 v27, v27, 0x8

    .line 712
    .line 713
    add-int v26, v26, v27

    .line 714
    .line 715
    and-int v26, v26, v8

    .line 716
    .line 717
    move/from16 v5, v16

    .line 718
    .line 719
    move/from16 v10, v31

    .line 720
    .line 721
    move-wide/from16 v15, v36

    .line 722
    .line 723
    goto/16 :goto_0

    .line 724
    .line 725
    :cond_11
    move/from16 v24, v6

    .line 726
    .line 727
    move/from16 v31, v10

    .line 728
    .line 729
    move-wide/from16 v36, v15

    .line 730
    .line 731
    const/16 v25, 0x3f

    .line 732
    .line 733
    const/16 v28, 0x7

    .line 734
    .line 735
    const-wide/16 v29, 0xff

    .line 736
    .line 737
    const-wide v34, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    move/from16 v16, v5

    .line 743
    .line 744
    if-ne v3, v7, :cond_17

    .line 745
    .line 746
    iget-object v3, v0, Lh0/h;->h:Lr/z;

    .line 747
    .line 748
    if-eqz v3, :cond_16

    .line 749
    .line 750
    invoke-virtual {v3, v1, v2}, Lr/z;->a(J)Z

    .line 751
    .line 752
    .line 753
    move-result v3

    .line 754
    if-ne v3, v7, :cond_16

    .line 755
    .line 756
    iget-object v3, v0, Lh0/h;->h:Lr/z;

    .line 757
    .line 758
    if-eqz v3, :cond_14

    .line 759
    .line 760
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 761
    .line 762
    .line 763
    move-result v4

    .line 764
    mul-int v4, v4, v31

    .line 765
    .line 766
    shl-int/lit8 v5, v4, 0x10

    .line 767
    .line 768
    xor-int/2addr v4, v5

    .line 769
    and-int/lit8 v5, v4, 0x7f

    .line 770
    .line 771
    iget v6, v3, Lr/z;->c:I

    .line 772
    .line 773
    ushr-int/lit8 v4, v4, 0x7

    .line 774
    .line 775
    :goto_e
    and-int/2addr v4, v6

    .line 776
    iget-object v7, v3, Lr/z;->a:[J

    .line 777
    .line 778
    shr-int/lit8 v8, v4, 0x3

    .line 779
    .line 780
    and-int/lit8 v9, v4, 0x7

    .line 781
    .line 782
    shl-int/lit8 v9, v9, 0x3

    .line 783
    .line 784
    aget-wide v10, v7, v8

    .line 785
    .line 786
    ushr-long/2addr v10, v9

    .line 787
    const/16 v33, 0x1

    .line 788
    .line 789
    add-int/lit8 v8, v8, 0x1

    .line 790
    .line 791
    aget-wide v12, v7, v8

    .line 792
    .line 793
    rsub-int/lit8 v7, v9, 0x40

    .line 794
    .line 795
    shl-long v7, v12, v7

    .line 796
    .line 797
    int-to-long v12, v9

    .line 798
    neg-long v12, v12

    .line 799
    shr-long v12, v12, v25

    .line 800
    .line 801
    and-long/2addr v7, v12

    .line 802
    or-long/2addr v7, v10

    .line 803
    int-to-long v9, v5

    .line 804
    mul-long v9, v9, v17

    .line 805
    .line 806
    xor-long/2addr v9, v7

    .line 807
    sub-long v11, v9, v17

    .line 808
    .line 809
    not-long v9, v9

    .line 810
    and-long/2addr v9, v11

    .line 811
    and-long v9, v9, v34

    .line 812
    .line 813
    :goto_f
    cmp-long v11, v9, v36

    .line 814
    .line 815
    if-eqz v11, :cond_13

    .line 816
    .line 817
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 818
    .line 819
    .line 820
    move-result v11

    .line 821
    shr-int/lit8 v11, v11, 0x3

    .line 822
    .line 823
    add-int/2addr v11, v4

    .line 824
    and-int/2addr v11, v6

    .line 825
    iget-object v12, v3, Lr/z;->b:[J

    .line 826
    .line 827
    aget-wide v13, v12, v11

    .line 828
    .line 829
    cmp-long v12, v13, v1

    .line 830
    .line 831
    if-nez v12, :cond_12

    .line 832
    .line 833
    goto :goto_10

    .line 834
    :cond_12
    sub-long v11, v9, v22

    .line 835
    .line 836
    and-long/2addr v9, v11

    .line 837
    goto :goto_f

    .line 838
    :cond_13
    not-long v9, v7

    .line 839
    shl-long v9, v9, p1

    .line 840
    .line 841
    and-long/2addr v7, v9

    .line 842
    and-long v7, v7, v34

    .line 843
    .line 844
    cmp-long v7, v7, v36

    .line 845
    .line 846
    if-eqz v7, :cond_15

    .line 847
    .line 848
    const/4 v11, -0x1

    .line 849
    :goto_10
    if-ltz v11, :cond_14

    .line 850
    .line 851
    iget v1, v3, Lr/z;->d:I

    .line 852
    .line 853
    const/16 v33, 0x1

    .line 854
    .line 855
    add-int/lit8 v1, v1, -0x1

    .line 856
    .line 857
    iput v1, v3, Lr/z;->d:I

    .line 858
    .line 859
    iget-object v1, v3, Lr/z;->a:[J

    .line 860
    .line 861
    iget v2, v3, Lr/z;->c:I

    .line 862
    .line 863
    shr-int/lit8 v3, v11, 0x3

    .line 864
    .line 865
    and-int/lit8 v4, v11, 0x7

    .line 866
    .line 867
    shl-int/lit8 v4, v4, 0x3

    .line 868
    .line 869
    aget-wide v5, v1, v3

    .line 870
    .line 871
    shl-long v7, v29, v4

    .line 872
    .line 873
    not-long v7, v7

    .line 874
    and-long/2addr v5, v7

    .line 875
    shl-long v7, v19, v4

    .line 876
    .line 877
    or-long v4, v5, v7

    .line 878
    .line 879
    aput-wide v4, v1, v3

    .line 880
    .line 881
    add-int/lit8 v11, v11, -0x7

    .line 882
    .line 883
    and-int v3, v11, v2

    .line 884
    .line 885
    and-int/lit8 v2, v2, 0x7

    .line 886
    .line 887
    add-int/2addr v3, v2

    .line 888
    shr-int/lit8 v2, v3, 0x3

    .line 889
    .line 890
    aput-wide v4, v1, v2

    .line 891
    .line 892
    const/16 v33, 0x1

    .line 893
    .line 894
    return v33

    .line 895
    :cond_14
    const/16 v33, 0x1

    .line 896
    .line 897
    goto :goto_11

    .line 898
    :cond_15
    const/16 v33, 0x1

    .line 899
    .line 900
    add-int/lit8 v21, v21, 0x8

    .line 901
    .line 902
    add-int v4, v4, v21

    .line 903
    .line 904
    goto/16 :goto_e

    .line 905
    .line 906
    :cond_16
    return v21

    .line 907
    :cond_17
    move/from16 v33, v7

    .line 908
    .line 909
    :goto_11
    return v33
.end method
