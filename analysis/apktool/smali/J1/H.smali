.class public final LJ1/H;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Le/g;

.field public B:Le/g;

.field public C:Ljava/util/ArrayDeque;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;

.field public J:Ljava/util/ArrayList;

.field public K:Ljava/util/ArrayList;

.field public L:LJ1/K;

.field public final M:LA1/b;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:LE/c0;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:LJ1/w;

.field public g:Lb/A;

.field public final h:LJ1/z;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:LB0/o;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:LJ1/x;

.field public final o:LJ1/x;

.field public final p:LJ1/x;

.field public final q:LJ1/x;

.field public final r:LJ1/A;

.field public s:I

.field public t:LJ1/u;

.field public u:LC3/a;

.field public v:LJ1/q;

.field public w:LJ1/q;

.field public final x:LJ1/B;

.field public final y:Lx3/k;

.field public z:Le/g;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, LE/c0;

    .line 12
    .line 13
    const/4 v1, 0x4

    .line 14
    invoke-direct {v0, v1}, LE/c0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, LJ1/H;->c:LE/c0;

    .line 18
    .line 19
    new-instance v0, LJ1/w;

    .line 20
    .line 21
    invoke-direct {v0, p0}, LJ1/w;-><init>(LJ1/H;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, LJ1/H;->f:LJ1/w;

    .line 25
    .line 26
    new-instance v0, LJ1/z;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, v1, p0}, LJ1/z;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, LJ1/H;->h:LJ1/z;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LJ1/H;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 40
    .line 41
    new-instance v0, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, LJ1/H;->j:Ljava/util/Map;

    .line 51
    .line 52
    new-instance v0, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, LJ1/H;->k:Ljava/util/Map;

    .line 62
    .line 63
    new-instance v0, Ljava/util/HashMap;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    new-instance v0, LB0/o;

    .line 72
    .line 73
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 77
    .line 78
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v1, v0, LB0/o;->q:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object p0, v0, LB0/o;->r:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v0, p0, LJ1/H;->l:LB0/o;

    .line 86
    .line 87
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 88
    .line 89
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, LJ1/H;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    new-instance v0, LJ1/x;

    .line 95
    .line 96
    const/4 v1, 0x0

    .line 97
    invoke-direct {v0, p0, v1}, LJ1/x;-><init>(LJ1/H;I)V

    .line 98
    .line 99
    .line 100
    iput-object v0, p0, LJ1/H;->n:LJ1/x;

    .line 101
    .line 102
    new-instance v0, LJ1/x;

    .line 103
    .line 104
    const/4 v1, 0x1

    .line 105
    invoke-direct {v0, p0, v1}, LJ1/x;-><init>(LJ1/H;I)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, LJ1/H;->o:LJ1/x;

    .line 109
    .line 110
    new-instance v0, LJ1/x;

    .line 111
    .line 112
    const/4 v1, 0x2

    .line 113
    invoke-direct {v0, p0, v1}, LJ1/x;-><init>(LJ1/H;I)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, LJ1/H;->p:LJ1/x;

    .line 117
    .line 118
    new-instance v0, LJ1/x;

    .line 119
    .line 120
    const/4 v1, 0x3

    .line 121
    invoke-direct {v0, p0, v1}, LJ1/x;-><init>(LJ1/H;I)V

    .line 122
    .line 123
    .line 124
    iput-object v0, p0, LJ1/H;->q:LJ1/x;

    .line 125
    .line 126
    new-instance v0, LJ1/A;

    .line 127
    .line 128
    invoke-direct {v0, p0}, LJ1/A;-><init>(LJ1/H;)V

    .line 129
    .line 130
    .line 131
    iput-object v0, p0, LJ1/H;->r:LJ1/A;

    .line 132
    .line 133
    const/4 v0, -0x1

    .line 134
    iput v0, p0, LJ1/H;->s:I

    .line 135
    .line 136
    new-instance v0, LJ1/B;

    .line 137
    .line 138
    invoke-direct {v0, p0}, LJ1/B;-><init>(LJ1/H;)V

    .line 139
    .line 140
    .line 141
    iput-object v0, p0, LJ1/H;->x:LJ1/B;

    .line 142
    .line 143
    new-instance v0, Lx3/k;

    .line 144
    .line 145
    const/16 v1, 0x8

    .line 146
    .line 147
    invoke-direct {v0, v1}, Lx3/k;-><init>(I)V

    .line 148
    .line 149
    .line 150
    iput-object v0, p0, LJ1/H;->y:Lx3/k;

    .line 151
    .line 152
    new-instance v0, Ljava/util/ArrayDeque;

    .line 153
    .line 154
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v0, p0, LJ1/H;->C:Ljava/util/ArrayDeque;

    .line 158
    .line 159
    new-instance v0, LA1/b;

    .line 160
    .line 161
    const/4 v1, 0x5

    .line 162
    invoke-direct {v0, v1, p0}, LA1/b;-><init>(ILjava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iput-object v0, p0, LJ1/H;->M:LA1/b;

    .line 166
    .line 167
    return-void
.end method

.method public static F(I)Z
    .locals 1

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static G(LJ1/q;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, LJ1/q;->J:LJ1/H;

    .line 5
    .line 6
    iget-object p0, p0, LJ1/H;->c:LE/c0;

    .line 7
    .line 8
    invoke-virtual {p0}, LE/c0;->q()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :cond_0
    if-ge v3, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    check-cast v4, LJ1/q;

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    invoke-static {v4}, LJ1/H;->G(LJ1/q;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    :cond_1
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    return v1
.end method

.method public static I(LJ1/q;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-boolean v0, p0, LJ1/q;->R:Z

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, p0, LJ1/q;->H:LJ1/H;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, LJ1/q;->K:LJ1/q;

    .line 13
    .line 14
    invoke-static {p0}, LJ1/H;->I(LJ1/q;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static J(LJ1/q;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, LJ1/q;->H:LJ1/H;

    .line 5
    .line 6
    iget-object v1, v0, LJ1/H;->w:LJ1/q;

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    iget-object p0, v0, LJ1/H;->v:LJ1/q;

    .line 15
    .line 16
    invoke-static {p0}, LJ1/H;->J(LJ1/q;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x1

    .line 23
    return p0

    .line 24
    :cond_1
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public static Y(LJ1/q;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "show: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p0, LJ1/q;->O:Z

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, LJ1/q;->O:Z

    .line 33
    .line 34
    iget-boolean v0, p0, LJ1/q;->Y:Z

    .line 35
    .line 36
    xor-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    iput-boolean v0, p0, LJ1/q;->Y:Z

    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public final A(I)LJ1/q;
    .locals 5

    .line 1
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 2
    .line 3
    iget-object v1, v0, LE/c0;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    add-int/lit8 v2, v2, -0x1

    .line 12
    .line 13
    :goto_0
    if-ltz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, LJ1/q;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    iget v4, v3, LJ1/q;->L:I

    .line 24
    .line 25
    if-ne v4, p1, :cond_0

    .line 26
    .line 27
    return-object v3

    .line 28
    :cond_0
    add-int/lit8 v2, v2, -0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    iget-object v0, v0, LE/c0;->r:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, LJ1/N;

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    iget-object v1, v1, LJ1/N;->c:LJ1/q;

    .line 58
    .line 59
    iget v2, v1, LJ1/q;->L:I

    .line 60
    .line 61
    if-ne v2, p1, :cond_2

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    const/4 p1, 0x0

    .line 65
    return-object p1
.end method

.method public final B(LJ1/q;)Landroid/view/ViewGroup;
    .locals 1

    .line 1
    iget-object v0, p1, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget v0, p1, LJ1/q;->M:I

    .line 7
    .line 8
    if-gtz v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget-object v0, p0, LJ1/H;->u:LC3/a;

    .line 12
    .line 13
    invoke-virtual {v0}, LC3/a;->K()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, LJ1/H;->u:LC3/a;

    .line 20
    .line 21
    iget p1, p1, LJ1/q;->M:I

    .line 22
    .line 23
    invoke-virtual {v0, p1}, LC3/a;->J(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p1, Landroid/view/ViewGroup;

    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 35
    return-object p1
.end method

.method public final C()LJ1/B;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/H;->v:LJ1/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LJ1/q;->H:LJ1/H;

    .line 6
    .line 7
    invoke-virtual {v0}, LJ1/H;->C()LJ1/B;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, LJ1/H;->x:LJ1/B;

    .line 13
    .line 14
    return-object v0
.end method

.method public final D()Lx3/k;
    .locals 1

    .line 1
    iget-object v0, p0, LJ1/H;->v:LJ1/q;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, LJ1/q;->H:LJ1/H;

    .line 6
    .line 7
    invoke-virtual {v0}, LJ1/H;->D()Lx3/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v0, p0, LJ1/H;->y:Lx3/k;

    .line 13
    .line 14
    return-object v0
.end method

.method public final E(LJ1/q;)V
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "hide: "

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "FragmentManager"

    .line 23
    .line 24
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v0, p1, LJ1/q;->O:Z

    .line 28
    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p1, LJ1/q;->O:Z

    .line 33
    .line 34
    iget-boolean v1, p1, LJ1/q;->Y:Z

    .line 35
    .line 36
    xor-int/2addr v0, v1

    .line 37
    iput-boolean v0, p1, LJ1/q;->Y:Z

    .line 38
    .line 39
    invoke-virtual {p0, p1}, LJ1/H;->X(LJ1/q;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final H()Z
    .locals 2

    .line 1
    iget-object v0, p0, LJ1/H;->v:LJ1/q;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v1, v0, LJ1/q;->I:LJ1/u;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-boolean v1, v0, LJ1/q;->A:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, LJ1/q;->k()LJ1/H;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, LJ1/H;->H()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :goto_0
    const/4 v0, 0x1

    .line 25
    return v0

    .line 26
    :cond_1
    const/4 v0, 0x0

    .line 27
    return v0
.end method

.method public final K(IZ)V
    .locals 5

    .line 1
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne p1, v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string p2, "No activity"

    .line 12
    .line 13
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :cond_1
    :goto_0
    if-nez p2, :cond_2

    .line 18
    .line 19
    iget p2, p0, LJ1/H;->s:I

    .line 20
    .line 21
    if-ne p1, p2, :cond_2

    .line 22
    .line 23
    goto :goto_3

    .line 24
    :cond_2
    iput p1, p0, LJ1/H;->s:I

    .line 25
    .line 26
    iget-object p1, p0, LJ1/H;->c:LE/c0;

    .line 27
    .line 28
    iget-object p2, p1, LE/c0;->r:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p2, Ljava/util/HashMap;

    .line 31
    .line 32
    iget-object v0, p1, LE/c0;->q:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    const/4 v2, 0x0

    .line 41
    move v3, v2

    .line 42
    :cond_3
    :goto_1
    if-ge v3, v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    check-cast v4, LJ1/q;

    .line 51
    .line 52
    iget-object v4, v4, LJ1/q;->u:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    check-cast v4, LJ1/N;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    invoke-virtual {v4}, LJ1/N;->k()V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, LJ1/N;

    .line 85
    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    invoke-virtual {v0}, LJ1/N;->k()V

    .line 89
    .line 90
    .line 91
    iget-object v1, v0, LJ1/N;->c:LJ1/q;

    .line 92
    .line 93
    iget-boolean v3, v1, LJ1/q;->B:Z

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    invoke-virtual {v1}, LJ1/q;->o()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    invoke-virtual {p1, v0}, LE/c0;->x(LJ1/N;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_6
    invoke-virtual {p0}, LJ1/H;->Z()V

    .line 108
    .line 109
    .line 110
    iget-boolean p1, p0, LJ1/H;->D:Z

    .line 111
    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 115
    .line 116
    if-eqz p1, :cond_7

    .line 117
    .line 118
    iget p2, p0, LJ1/H;->s:I

    .line 119
    .line 120
    const/4 v0, 0x7

    .line 121
    if-ne p2, v0, :cond_7

    .line 122
    .line 123
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 124
    .line 125
    invoke-virtual {p1}, Lh/h;->invalidateOptionsMenu()V

    .line 126
    .line 127
    .line 128
    iput-boolean v2, p0, LJ1/H;->D:Z

    .line 129
    .line 130
    :cond_7
    :goto_3
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    iput-boolean v0, p0, LJ1/H;->E:Z

    .line 8
    .line 9
    iput-boolean v0, p0, LJ1/H;->F:Z

    .line 10
    .line 11
    iget-object v1, p0, LJ1/H;->L:LJ1/K;

    .line 12
    .line 13
    iput-boolean v0, v1, LJ1/K;->g:Z

    .line 14
    .line 15
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 16
    .line 17
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, LJ1/q;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 40
    .line 41
    invoke-virtual {v1}, LJ1/H;->L()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    :goto_1
    return-void
.end method

.method public final M()Z
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-virtual {p0, v0, v1}, LJ1/H;->N(II)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final N(II)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, LJ1/H;->y(Z)Z

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, LJ1/H;->x(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LJ1/H;->w:LJ1/q;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-gez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, LJ1/q;->h()LJ1/H;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, LJ1/H;->M()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return v0

    .line 26
    :cond_0
    iget-object v1, p0, LJ1/H;->I:Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v2, p0, LJ1/H;->J:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p0, v1, v2, p1, p2}, LJ1/H;->O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iput-boolean v0, p0, LJ1/H;->b:Z

    .line 37
    .line 38
    :try_start_0
    iget-object p2, p0, LJ1/H;->I:Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v0, p0, LJ1/H;->J:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {p0, p2, v0}, LJ1/H;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, LJ1/H;->d()V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p0}, LJ1/H;->d()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_1
    :goto_0
    invoke-virtual {p0}, LJ1/H;->b0()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, LJ1/H;->u()V

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, LJ1/H;->c:LE/c0;

    .line 61
    .line 62
    iget-object p2, p2, LE/c0;->r:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p2, Ljava/util/HashMap;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-interface {p2, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 76
    .line 77
    .line 78
    return p1
.end method

.method public final O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p4, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p4, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move p4, v1

    .line 9
    :goto_0
    iget-object v2, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_9

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    goto :goto_4

    .line 21
    :cond_1
    if-gez p3, :cond_3

    .line 22
    .line 23
    if-eqz p4, :cond_2

    .line 24
    .line 25
    move v3, v1

    .line 26
    goto :goto_4

    .line 27
    :cond_2
    iget-object p3, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    add-int/lit8 v3, p3, -0x1

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_3
    iget-object v2, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    sub-int/2addr v2, v0

    .line 43
    :goto_1
    if-ltz v2, :cond_5

    .line 44
    .line 45
    iget-object v4, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, LJ1/a;

    .line 52
    .line 53
    if-ltz p3, :cond_4

    .line 54
    .line 55
    iget v4, v4, LJ1/a;->r:I

    .line 56
    .line 57
    if-ne p3, v4, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_5
    :goto_2
    if-gez v2, :cond_6

    .line 64
    .line 65
    move v3, v2

    .line 66
    goto :goto_4

    .line 67
    :cond_6
    if-eqz p4, :cond_7

    .line 68
    .line 69
    move v3, v2

    .line 70
    :goto_3
    if-lez v3, :cond_9

    .line 71
    .line 72
    iget-object p4, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 73
    .line 74
    add-int/lit8 v2, v3, -0x1

    .line 75
    .line 76
    invoke-virtual {p4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p4

    .line 80
    check-cast p4, LJ1/a;

    .line 81
    .line 82
    if-ltz p3, :cond_9

    .line 83
    .line 84
    iget p4, p4, LJ1/a;->r:I

    .line 85
    .line 86
    if-ne p3, p4, :cond_9

    .line 87
    .line 88
    add-int/lit8 v3, v3, -0x1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_7
    iget-object p3, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 94
    .line 95
    .line 96
    move-result p3

    .line 97
    sub-int/2addr p3, v0

    .line 98
    if-ne v2, p3, :cond_8

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_8
    add-int/lit8 v3, v2, 0x1

    .line 102
    .line 103
    :cond_9
    :goto_4
    if-gez v3, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    iget-object p3, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 109
    .line 110
    .line 111
    move-result p3

    .line 112
    sub-int/2addr p3, v0

    .line 113
    :goto_5
    if-lt p3, v3, :cond_b

    .line 114
    .line 115
    iget-object p4, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p4

    .line 121
    check-cast p4, LJ1/a;

    .line 122
    .line 123
    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 127
    .line 128
    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    add-int/lit8 p3, p3, -0x1

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_b
    return v0
.end method

.method public final P(LJ1/q;)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v0, "FragmentManager"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v2, "remove: "

    .line 13
    .line 14
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v2, " nesting="

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget v2, p1, LJ1/q;->G:I

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, LJ1/q;->o()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-boolean v1, p1, LJ1/q;->P:Z

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    if-nez v0, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    return-void

    .line 49
    :cond_2
    :goto_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 50
    .line 51
    iget-object v1, v0, LE/c0;->q:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    monitor-enter v1

    .line 56
    :try_start_0
    iget-object v0, v0, LE/c0;->q:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    const/4 v0, 0x0

    .line 65
    iput-boolean v0, p1, LJ1/q;->A:Z

    .line 66
    .line 67
    invoke-static {p1}, LJ1/H;->G(LJ1/q;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x1

    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    iput-boolean v1, p0, LJ1/H;->D:Z

    .line 75
    .line 76
    :cond_3
    iput-boolean v1, p1, LJ1/q;->B:Z

    .line 77
    .line 78
    invoke-virtual {p0, p1}, LJ1/H;->X(LJ1/q;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 84
    throw p1
.end method

.method public final Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ne v0, v1, :cond_6

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    move v2, v1

    .line 24
    :goto_0
    if-ge v1, v0, :cond_4

    .line 25
    .line 26
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, LJ1/a;

    .line 31
    .line 32
    iget-boolean v3, v3, LJ1/a;->o:Z

    .line 33
    .line 34
    if-nez v3, :cond_3

    .line 35
    .line 36
    if-eq v2, v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, v2, v1}, LJ1/H;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    check-cast v3, Ljava/lang/Boolean;

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_2

    .line 54
    .line 55
    :goto_1
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    check-cast v3, Ljava/lang/Boolean;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, LJ1/a;

    .line 74
    .line 75
    iget-boolean v3, v3, LJ1/a;->o:Z

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, LJ1/H;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 83
    .line 84
    .line 85
    add-int/lit8 v1, v2, -0x1

    .line 86
    .line 87
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    if-eq v2, v0, :cond_5

    .line 91
    .line 92
    invoke-virtual {p0, p1, p2, v2, v0}, LJ1/H;->z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    return-void

    .line 96
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string p2, "Internal error with the back stack records"

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method public final R(Landroid/os/Parcelable;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/String;

    .line 26
    .line 27
    const-string v4, "result_"

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    iget-object v5, v0, LJ1/H;->t:LJ1/u;

    .line 42
    .line 43
    iget-object v5, v5, LJ1/u;->u:Lh/h;

    .line 44
    .line 45
    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x7

    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v5, v0, LJ1/H;->k:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    const-string v5, "state"

    .line 81
    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    const-string v6, "fragment_"

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_2

    .line 97
    .line 98
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    if-eqz v4, :cond_2

    .line 103
    .line 104
    iget-object v6, v0, LJ1/H;->t:LJ1/u;

    .line 105
    .line 106
    iget-object v6, v6, LJ1/u;->u:Lh/h;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v4, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, LJ1/M;

    .line 120
    .line 121
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    iget-object v3, v0, LJ1/H;->c:LE/c0;

    .line 126
    .line 127
    iget-object v4, v3, LE/c0;->s:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Ljava/util/HashMap;

    .line 130
    .line 131
    iget-object v6, v3, LE/c0;->r:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v6, Ljava/util/HashMap;

    .line 134
    .line 135
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    const/4 v9, 0x0

    .line 143
    :goto_2
    if-ge v9, v7, :cond_4

    .line 144
    .line 145
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    add-int/lit8 v9, v9, 0x1

    .line 150
    .line 151
    check-cast v10, LJ1/M;

    .line 152
    .line 153
    iget-object v11, v10, LJ1/M;->r:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v4, v11, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_4
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, LJ1/I;

    .line 164
    .line 165
    if-nez v1, :cond_5

    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    invoke-virtual {v6}, Ljava/util/HashMap;->clear()V

    .line 169
    .line 170
    .line 171
    iget-object v2, v1, LJ1/I;->q:Ljava/util/ArrayList;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    const/4 v5, 0x0

    .line 178
    :cond_6
    :goto_3
    iget-object v7, v0, LJ1/H;->l:LB0/o;

    .line 179
    .line 180
    const-string v9, "): "

    .line 181
    .line 182
    const/4 v10, 0x2

    .line 183
    const-string v11, "FragmentManager"

    .line 184
    .line 185
    if-ge v5, v4, :cond_a

    .line 186
    .line 187
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v12

    .line 191
    add-int/lit8 v5, v5, 0x1

    .line 192
    .line 193
    check-cast v12, Ljava/lang/String;

    .line 194
    .line 195
    iget-object v13, v3, LE/c0;->s:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v13, Ljava/util/HashMap;

    .line 198
    .line 199
    invoke-virtual {v13, v12}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v12

    .line 203
    check-cast v12, LJ1/M;

    .line 204
    .line 205
    if-eqz v12, :cond_6

    .line 206
    .line 207
    iget-object v13, v0, LJ1/H;->L:LJ1/K;

    .line 208
    .line 209
    iget-object v14, v12, LJ1/M;->r:Ljava/lang/String;

    .line 210
    .line 211
    iget-object v13, v13, LJ1/K;->b:Ljava/util/HashMap;

    .line 212
    .line 213
    invoke-virtual {v13, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v13

    .line 217
    check-cast v13, LJ1/q;

    .line 218
    .line 219
    if-eqz v13, :cond_8

    .line 220
    .line 221
    invoke-static {v10}, LJ1/H;->F(I)Z

    .line 222
    .line 223
    .line 224
    move-result v14

    .line 225
    if-eqz v14, :cond_7

    .line 226
    .line 227
    new-instance v14, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    const-string v15, "restoreSaveState: re-attaching retained "

    .line 230
    .line 231
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v14

    .line 241
    invoke-static {v11, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 242
    .line 243
    .line 244
    :cond_7
    new-instance v14, LJ1/N;

    .line 245
    .line 246
    invoke-direct {v14, v7, v3, v13, v12}, LJ1/N;-><init>(LB0/o;LE/c0;LJ1/q;LJ1/M;)V

    .line 247
    .line 248
    .line 249
    goto :goto_4

    .line 250
    :cond_8
    new-instance v13, LJ1/N;

    .line 251
    .line 252
    iget-object v7, v0, LJ1/H;->t:LJ1/u;

    .line 253
    .line 254
    iget-object v7, v7, LJ1/u;->u:Lh/h;

    .line 255
    .line 256
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 257
    .line 258
    .line 259
    move-result-object v16

    .line 260
    invoke-virtual {v0}, LJ1/H;->C()LJ1/B;

    .line 261
    .line 262
    .line 263
    move-result-object v17

    .line 264
    iget-object v14, v0, LJ1/H;->l:LB0/o;

    .line 265
    .line 266
    iget-object v15, v0, LJ1/H;->c:LE/c0;

    .line 267
    .line 268
    move-object/from16 v18, v12

    .line 269
    .line 270
    invoke-direct/range {v13 .. v18}, LJ1/N;-><init>(LB0/o;LE/c0;Ljava/lang/ClassLoader;LJ1/B;LJ1/M;)V

    .line 271
    .line 272
    .line 273
    move-object v14, v13

    .line 274
    :goto_4
    iget-object v7, v14, LJ1/N;->c:LJ1/q;

    .line 275
    .line 276
    iput-object v0, v7, LJ1/q;->H:LJ1/H;

    .line 277
    .line 278
    invoke-static {v10}, LJ1/H;->F(I)Z

    .line 279
    .line 280
    .line 281
    move-result v10

    .line 282
    if-eqz v10, :cond_9

    .line 283
    .line 284
    new-instance v10, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    const-string v12, "restoreSaveState: active ("

    .line 287
    .line 288
    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    iget-object v12, v7, LJ1/q;->u:Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-static {v11, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    :cond_9
    iget-object v7, v0, LJ1/H;->t:LJ1/u;

    .line 310
    .line 311
    iget-object v7, v7, LJ1/u;->u:Lh/h;

    .line 312
    .line 313
    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    invoke-virtual {v14, v7}, LJ1/N;->m(Ljava/lang/ClassLoader;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v14}, LE/c0;->w(LJ1/N;)V

    .line 321
    .line 322
    .line 323
    iget v7, v0, LJ1/H;->s:I

    .line 324
    .line 325
    iput v7, v14, LJ1/N;->e:I

    .line 326
    .line 327
    goto/16 :goto_3

    .line 328
    .line 329
    :cond_a
    iget-object v2, v0, LJ1/H;->L:LJ1/K;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    new-instance v4, Ljava/util/ArrayList;

    .line 335
    .line 336
    iget-object v2, v2, LJ1/K;->b:Ljava/util/HashMap;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 339
    .line 340
    .line 341
    move-result-object v2

    .line 342
    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    const/4 v5, 0x0

    .line 350
    :goto_5
    const/4 v12, 0x1

    .line 351
    if-ge v5, v2, :cond_d

    .line 352
    .line 353
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    add-int/lit8 v5, v5, 0x1

    .line 358
    .line 359
    check-cast v13, LJ1/q;

    .line 360
    .line 361
    iget-object v14, v13, LJ1/q;->u:Ljava/lang/String;

    .line 362
    .line 363
    invoke-virtual {v6, v14}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v14

    .line 367
    if-eqz v14, :cond_b

    .line 368
    .line 369
    goto :goto_5

    .line 370
    :cond_b
    invoke-static {v10}, LJ1/H;->F(I)Z

    .line 371
    .line 372
    .line 373
    move-result v14

    .line 374
    if-eqz v14, :cond_c

    .line 375
    .line 376
    new-instance v14, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    const-string v15, "Discarding retained Fragment "

    .line 379
    .line 380
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    const-string v15, " that was not found in the set of active Fragments "

    .line 387
    .line 388
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    iget-object v15, v1, LJ1/I;->q:Ljava/util/ArrayList;

    .line 392
    .line 393
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    invoke-static {v11, v14}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 401
    .line 402
    .line 403
    :cond_c
    iget-object v14, v0, LJ1/H;->L:LJ1/K;

    .line 404
    .line 405
    invoke-virtual {v14, v13}, LJ1/K;->e(LJ1/q;)V

    .line 406
    .line 407
    .line 408
    iput-object v0, v13, LJ1/q;->H:LJ1/H;

    .line 409
    .line 410
    new-instance v14, LJ1/N;

    .line 411
    .line 412
    invoke-direct {v14, v7, v3, v13}, LJ1/N;-><init>(LB0/o;LE/c0;LJ1/q;)V

    .line 413
    .line 414
    .line 415
    iput v12, v14, LJ1/N;->e:I

    .line 416
    .line 417
    invoke-virtual {v14}, LJ1/N;->k()V

    .line 418
    .line 419
    .line 420
    iput-boolean v12, v13, LJ1/q;->B:Z

    .line 421
    .line 422
    invoke-virtual {v14}, LJ1/N;->k()V

    .line 423
    .line 424
    .line 425
    goto :goto_5

    .line 426
    :cond_d
    iget-object v2, v1, LJ1/I;->r:Ljava/util/ArrayList;

    .line 427
    .line 428
    iget-object v4, v3, LE/c0;->q:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast v4, Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 433
    .line 434
    .line 435
    if-eqz v2, :cond_10

    .line 436
    .line 437
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 438
    .line 439
    .line 440
    move-result v4

    .line 441
    const/4 v5, 0x0

    .line 442
    :goto_6
    if-ge v5, v4, :cond_10

    .line 443
    .line 444
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    add-int/lit8 v5, v5, 0x1

    .line 449
    .line 450
    check-cast v6, Ljava/lang/String;

    .line 451
    .line 452
    invoke-virtual {v3, v6}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    if-eqz v7, :cond_f

    .line 457
    .line 458
    invoke-static {v10}, LJ1/H;->F(I)Z

    .line 459
    .line 460
    .line 461
    move-result v13

    .line 462
    if-eqz v13, :cond_e

    .line 463
    .line 464
    new-instance v13, Ljava/lang/StringBuilder;

    .line 465
    .line 466
    const-string v14, "restoreSaveState: added ("

    .line 467
    .line 468
    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    invoke-static {v11, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 485
    .line 486
    .line 487
    :cond_e
    invoke-virtual {v3, v7}, LE/c0;->c(LJ1/q;)V

    .line 488
    .line 489
    .line 490
    goto :goto_6

    .line 491
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 492
    .line 493
    const-string v2, "No instantiated fragment for ("

    .line 494
    .line 495
    const-string v3, ")"

    .line 496
    .line 497
    invoke-static {v2, v6, v3}, LC0/S;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v2

    .line 501
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v1

    .line 505
    :cond_10
    iget-object v2, v1, LJ1/I;->s:[LJ1/b;

    .line 506
    .line 507
    if-eqz v2, :cond_18

    .line 508
    .line 509
    new-instance v2, Ljava/util/ArrayList;

    .line 510
    .line 511
    iget-object v4, v1, LJ1/I;->s:[LJ1/b;

    .line 512
    .line 513
    array-length v4, v4

    .line 514
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 515
    .line 516
    .line 517
    iput-object v2, v0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 518
    .line 519
    const/4 v2, 0x0

    .line 520
    :goto_7
    iget-object v4, v1, LJ1/I;->s:[LJ1/b;

    .line 521
    .line 522
    array-length v5, v4

    .line 523
    if-ge v2, v5, :cond_17

    .line 524
    .line 525
    aget-object v4, v4, v2

    .line 526
    .line 527
    iget-object v5, v4, LJ1/b;->r:Ljava/util/ArrayList;

    .line 528
    .line 529
    new-instance v6, LJ1/a;

    .line 530
    .line 531
    invoke-direct {v6, v0}, LJ1/a;-><init>(LJ1/H;)V

    .line 532
    .line 533
    .line 534
    iget-object v7, v4, LJ1/b;->q:[I

    .line 535
    .line 536
    const/4 v13, 0x0

    .line 537
    const/4 v14, 0x0

    .line 538
    :goto_8
    array-length v15, v7

    .line 539
    if-ge v13, v15, :cond_13

    .line 540
    .line 541
    new-instance v15, LJ1/O;

    .line 542
    .line 543
    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    .line 544
    .line 545
    .line 546
    add-int/lit8 v16, v13, 0x1

    .line 547
    .line 548
    move/from16 p1, v10

    .line 549
    .line 550
    aget v10, v7, v13

    .line 551
    .line 552
    iput v10, v15, LJ1/O;->a:I

    .line 553
    .line 554
    invoke-static/range {p1 .. p1}, LJ1/H;->F(I)Z

    .line 555
    .line 556
    .line 557
    move-result v10

    .line 558
    if-eqz v10, :cond_11

    .line 559
    .line 560
    new-instance v10, Ljava/lang/StringBuilder;

    .line 561
    .line 562
    const-string v8, "Instantiate "

    .line 563
    .line 564
    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    const-string v8, " op #"

    .line 571
    .line 572
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    const-string v8, " base fragment #"

    .line 579
    .line 580
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    aget v8, v7, v16

    .line 584
    .line 585
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v8

    .line 592
    invoke-static {v11, v8}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 593
    .line 594
    .line 595
    :cond_11
    invoke-static {}, Landroidx/lifecycle/p;->values()[Landroidx/lifecycle/p;

    .line 596
    .line 597
    .line 598
    move-result-object v8

    .line 599
    iget-object v10, v4, LJ1/b;->s:[I

    .line 600
    .line 601
    aget v10, v10, v14

    .line 602
    .line 603
    aget-object v8, v8, v10

    .line 604
    .line 605
    iput-object v8, v15, LJ1/O;->h:Landroidx/lifecycle/p;

    .line 606
    .line 607
    invoke-static {}, Landroidx/lifecycle/p;->values()[Landroidx/lifecycle/p;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    iget-object v10, v4, LJ1/b;->t:[I

    .line 612
    .line 613
    aget v10, v10, v14

    .line 614
    .line 615
    aget-object v8, v8, v10

    .line 616
    .line 617
    iput-object v8, v15, LJ1/O;->i:Landroidx/lifecycle/p;

    .line 618
    .line 619
    add-int/lit8 v8, v13, 0x2

    .line 620
    .line 621
    aget v10, v7, v16

    .line 622
    .line 623
    if-eqz v10, :cond_12

    .line 624
    .line 625
    move v10, v12

    .line 626
    goto :goto_9

    .line 627
    :cond_12
    const/4 v10, 0x0

    .line 628
    :goto_9
    iput-boolean v10, v15, LJ1/O;->c:Z

    .line 629
    .line 630
    add-int/lit8 v10, v13, 0x3

    .line 631
    .line 632
    aget v8, v7, v8

    .line 633
    .line 634
    iput v8, v15, LJ1/O;->d:I

    .line 635
    .line 636
    add-int/lit8 v16, v13, 0x4

    .line 637
    .line 638
    aget v10, v7, v10

    .line 639
    .line 640
    iput v10, v15, LJ1/O;->e:I

    .line 641
    .line 642
    add-int/lit8 v18, v13, 0x5

    .line 643
    .line 644
    aget v12, v7, v16

    .line 645
    .line 646
    iput v12, v15, LJ1/O;->f:I

    .line 647
    .line 648
    add-int/lit8 v13, v13, 0x6

    .line 649
    .line 650
    move-object/from16 v16, v7

    .line 651
    .line 652
    aget v7, v16, v18

    .line 653
    .line 654
    iput v7, v15, LJ1/O;->g:I

    .line 655
    .line 656
    iput v8, v6, LJ1/a;->b:I

    .line 657
    .line 658
    iput v10, v6, LJ1/a;->c:I

    .line 659
    .line 660
    iput v12, v6, LJ1/a;->d:I

    .line 661
    .line 662
    iput v7, v6, LJ1/a;->e:I

    .line 663
    .line 664
    invoke-virtual {v6, v15}, LJ1/a;->b(LJ1/O;)V

    .line 665
    .line 666
    .line 667
    add-int/lit8 v14, v14, 0x1

    .line 668
    .line 669
    move/from16 v10, p1

    .line 670
    .line 671
    move-object/from16 v7, v16

    .line 672
    .line 673
    const/4 v12, 0x1

    .line 674
    goto/16 :goto_8

    .line 675
    .line 676
    :cond_13
    move/from16 p1, v10

    .line 677
    .line 678
    iget v7, v4, LJ1/b;->u:I

    .line 679
    .line 680
    iput v7, v6, LJ1/a;->f:I

    .line 681
    .line 682
    iget-object v7, v4, LJ1/b;->v:Ljava/lang/String;

    .line 683
    .line 684
    iput-object v7, v6, LJ1/a;->h:Ljava/lang/String;

    .line 685
    .line 686
    const/4 v7, 0x1

    .line 687
    iput-boolean v7, v6, LJ1/a;->g:Z

    .line 688
    .line 689
    iget v7, v4, LJ1/b;->x:I

    .line 690
    .line 691
    iput v7, v6, LJ1/a;->i:I

    .line 692
    .line 693
    iget-object v7, v4, LJ1/b;->y:Ljava/lang/CharSequence;

    .line 694
    .line 695
    iput-object v7, v6, LJ1/a;->j:Ljava/lang/CharSequence;

    .line 696
    .line 697
    iget v7, v4, LJ1/b;->z:I

    .line 698
    .line 699
    iput v7, v6, LJ1/a;->k:I

    .line 700
    .line 701
    iget-object v7, v4, LJ1/b;->A:Ljava/lang/CharSequence;

    .line 702
    .line 703
    iput-object v7, v6, LJ1/a;->l:Ljava/lang/CharSequence;

    .line 704
    .line 705
    iget-object v7, v4, LJ1/b;->B:Ljava/util/ArrayList;

    .line 706
    .line 707
    iput-object v7, v6, LJ1/a;->m:Ljava/util/ArrayList;

    .line 708
    .line 709
    iget-object v7, v4, LJ1/b;->C:Ljava/util/ArrayList;

    .line 710
    .line 711
    iput-object v7, v6, LJ1/a;->n:Ljava/util/ArrayList;

    .line 712
    .line 713
    iget-boolean v7, v4, LJ1/b;->D:Z

    .line 714
    .line 715
    iput-boolean v7, v6, LJ1/a;->o:Z

    .line 716
    .line 717
    iget v4, v4, LJ1/b;->w:I

    .line 718
    .line 719
    iput v4, v6, LJ1/a;->r:I

    .line 720
    .line 721
    const/4 v4, 0x0

    .line 722
    :goto_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 723
    .line 724
    .line 725
    move-result v7

    .line 726
    if-ge v4, v7, :cond_15

    .line 727
    .line 728
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v7

    .line 732
    check-cast v7, Ljava/lang/String;

    .line 733
    .line 734
    if-eqz v7, :cond_14

    .line 735
    .line 736
    iget-object v8, v6, LJ1/a;->a:Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-virtual {v8, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v8

    .line 742
    check-cast v8, LJ1/O;

    .line 743
    .line 744
    invoke-virtual {v3, v7}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 745
    .line 746
    .line 747
    move-result-object v7

    .line 748
    iput-object v7, v8, LJ1/O;->b:LJ1/q;

    .line 749
    .line 750
    :cond_14
    add-int/lit8 v4, v4, 0x1

    .line 751
    .line 752
    goto :goto_a

    .line 753
    :cond_15
    const/4 v7, 0x1

    .line 754
    invoke-virtual {v6, v7}, LJ1/a;->c(I)V

    .line 755
    .line 756
    .line 757
    invoke-static/range {p1 .. p1}, LJ1/H;->F(I)Z

    .line 758
    .line 759
    .line 760
    move-result v4

    .line 761
    if-eqz v4, :cond_16

    .line 762
    .line 763
    const-string v4, "restoreAllState: back stack #"

    .line 764
    .line 765
    const-string v5, " (index "

    .line 766
    .line 767
    invoke-static {v4, v5, v2}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    iget v5, v6, LJ1/a;->r:I

    .line 772
    .line 773
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 777
    .line 778
    .line 779
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 780
    .line 781
    .line 782
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v4

    .line 786
    invoke-static {v11, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 787
    .line 788
    .line 789
    new-instance v4, LJ1/Q;

    .line 790
    .line 791
    invoke-direct {v4}, LJ1/Q;-><init>()V

    .line 792
    .line 793
    .line 794
    new-instance v5, Ljava/io/PrintWriter;

    .line 795
    .line 796
    invoke-direct {v5, v4}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 797
    .line 798
    .line 799
    const-string v4, "  "

    .line 800
    .line 801
    const/4 v8, 0x0

    .line 802
    invoke-virtual {v6, v4, v5, v8}, LJ1/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v5}, Ljava/io/PrintWriter;->close()V

    .line 806
    .line 807
    .line 808
    goto :goto_b

    .line 809
    :cond_16
    const/4 v8, 0x0

    .line 810
    :goto_b
    iget-object v4, v0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 811
    .line 812
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 813
    .line 814
    .line 815
    add-int/lit8 v2, v2, 0x1

    .line 816
    .line 817
    move/from16 v10, p1

    .line 818
    .line 819
    move v12, v7

    .line 820
    goto/16 :goto_7

    .line 821
    .line 822
    :cond_17
    const/4 v8, 0x0

    .line 823
    goto :goto_c

    .line 824
    :cond_18
    const/4 v8, 0x0

    .line 825
    const/4 v2, 0x0

    .line 826
    iput-object v2, v0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 827
    .line 828
    :goto_c
    iget-object v2, v0, LJ1/H;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 829
    .line 830
    iget v4, v1, LJ1/I;->t:I

    .line 831
    .line 832
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 833
    .line 834
    .line 835
    iget-object v2, v1, LJ1/I;->u:Ljava/lang/String;

    .line 836
    .line 837
    if-eqz v2, :cond_19

    .line 838
    .line 839
    invoke-virtual {v3, v2}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    iput-object v2, v0, LJ1/H;->w:LJ1/q;

    .line 844
    .line 845
    invoke-virtual {v0, v2}, LJ1/H;->q(LJ1/q;)V

    .line 846
    .line 847
    .line 848
    :cond_19
    iget-object v2, v1, LJ1/I;->v:Ljava/util/ArrayList;

    .line 849
    .line 850
    if-eqz v2, :cond_1a

    .line 851
    .line 852
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 853
    .line 854
    .line 855
    move-result v3

    .line 856
    if-ge v8, v3, :cond_1a

    .line 857
    .line 858
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v3

    .line 862
    check-cast v3, Ljava/lang/String;

    .line 863
    .line 864
    iget-object v4, v1, LJ1/I;->w:Ljava/util/ArrayList;

    .line 865
    .line 866
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v4

    .line 870
    check-cast v4, LJ1/c;

    .line 871
    .line 872
    iget-object v5, v0, LJ1/H;->j:Ljava/util/Map;

    .line 873
    .line 874
    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    add-int/lit8 v8, v8, 0x1

    .line 878
    .line 879
    goto :goto_d

    .line 880
    :cond_1a
    new-instance v2, Ljava/util/ArrayDeque;

    .line 881
    .line 882
    iget-object v1, v1, LJ1/I;->x:Ljava/util/ArrayList;

    .line 883
    .line 884
    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 885
    .line 886
    .line 887
    iput-object v2, v0, LJ1/H;->C:Ljava/util/ArrayDeque;

    .line 888
    .line 889
    return-void
.end method

.method public final S()Landroid/os/Bundle;
    .locals 15

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LJ1/H;->e()Ljava/util/HashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, LJ1/h;

    .line 27
    .line 28
    iget-boolean v5, v2, LJ1/h;->e:Z

    .line 29
    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, LJ1/H;->F(I)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    const-string v4, "FragmentManager"

    .line 39
    .line 40
    const-string v5, "SpecialEffectsController: Forcing postponed operations"

    .line 41
    .line 42
    invoke-static {v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    :cond_1
    iput-boolean v3, v2, LJ1/h;->e:Z

    .line 46
    .line 47
    invoke-virtual {v2}, LJ1/h;->c()V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0}, LJ1/H;->e()Ljava/util/HashSet;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, LJ1/h;

    .line 70
    .line 71
    invoke-virtual {v2}, LJ1/h;->e()V

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/4 v1, 0x1

    .line 76
    invoke-virtual {p0, v1}, LJ1/H;->y(Z)Z

    .line 77
    .line 78
    .line 79
    iput-boolean v1, p0, LJ1/H;->E:Z

    .line 80
    .line 81
    iget-object v2, p0, LJ1/H;->L:LJ1/K;

    .line 82
    .line 83
    iput-boolean v1, v2, LJ1/K;->g:Z

    .line 84
    .line 85
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v1, v1, LE/c0;->r:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Ljava/util/HashMap;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v5

    .line 115
    const/4 v6, 0x0

    .line 116
    if-eqz v5, :cond_10

    .line 117
    .line 118
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, LJ1/N;

    .line 123
    .line 124
    if-eqz v5, :cond_4

    .line 125
    .line 126
    iget-object v7, v5, LJ1/N;->c:LJ1/q;

    .line 127
    .line 128
    new-instance v8, LJ1/M;

    .line 129
    .line 130
    invoke-direct {v8, v7}, LJ1/M;-><init>(LJ1/q;)V

    .line 131
    .line 132
    .line 133
    iget v9, v7, LJ1/q;->q:I

    .line 134
    .line 135
    const/4 v10, -0x1

    .line 136
    if-le v9, v10, :cond_e

    .line 137
    .line 138
    iget-object v9, v8, LJ1/M;->C:Landroid/os/Bundle;

    .line 139
    .line 140
    if-nez v9, :cond_e

    .line 141
    .line 142
    new-instance v9, Landroid/os/Bundle;

    .line 143
    .line 144
    invoke-direct {v9}, Landroid/os/Bundle;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v9}, LJ1/q;->x(Landroid/os/Bundle;)V

    .line 148
    .line 149
    .line 150
    iget-object v10, v7, LJ1/q;->g0:LZ/m;

    .line 151
    .line 152
    invoke-virtual {v10, v9}, LZ/m;->A(Landroid/os/Bundle;)V

    .line 153
    .line 154
    .line 155
    iget-object v10, v7, LJ1/q;->J:LJ1/H;

    .line 156
    .line 157
    invoke-virtual {v10}, LJ1/H;->S()Landroid/os/Bundle;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    const-string v11, "android:support:fragments"

    .line 162
    .line 163
    invoke-virtual {v9, v11, v10}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 164
    .line 165
    .line 166
    iget-object v10, v5, LJ1/N;->a:LB0/o;

    .line 167
    .line 168
    invoke-virtual {v10, v3}, LB0/o;->y(Z)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 172
    .line 173
    .line 174
    move-result v10

    .line 175
    if-eqz v10, :cond_5

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_5
    move-object v6, v9

    .line 179
    :goto_3
    iget-object v9, v7, LJ1/q;->U:Landroid/view/View;

    .line 180
    .line 181
    if-eqz v9, :cond_6

    .line 182
    .line 183
    invoke-virtual {v5}, LJ1/N;->o()V

    .line 184
    .line 185
    .line 186
    :cond_6
    iget-object v9, v7, LJ1/q;->s:Landroid/util/SparseArray;

    .line 187
    .line 188
    if-eqz v9, :cond_8

    .line 189
    .line 190
    if-nez v6, :cond_7

    .line 191
    .line 192
    new-instance v6, Landroid/os/Bundle;

    .line 193
    .line 194
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 195
    .line 196
    .line 197
    :cond_7
    const-string v9, "android:view_state"

    .line 198
    .line 199
    iget-object v10, v7, LJ1/q;->s:Landroid/util/SparseArray;

    .line 200
    .line 201
    invoke-virtual {v6, v9, v10}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 202
    .line 203
    .line 204
    :cond_8
    iget-object v9, v7, LJ1/q;->t:Landroid/os/Bundle;

    .line 205
    .line 206
    if-eqz v9, :cond_a

    .line 207
    .line 208
    if-nez v6, :cond_9

    .line 209
    .line 210
    new-instance v6, Landroid/os/Bundle;

    .line 211
    .line 212
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 213
    .line 214
    .line 215
    :cond_9
    const-string v9, "android:view_registry_state"

    .line 216
    .line 217
    iget-object v10, v7, LJ1/q;->t:Landroid/os/Bundle;

    .line 218
    .line 219
    invoke-virtual {v6, v9, v10}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 220
    .line 221
    .line 222
    :cond_a
    iget-boolean v9, v7, LJ1/q;->W:Z

    .line 223
    .line 224
    if-nez v9, :cond_c

    .line 225
    .line 226
    if-nez v6, :cond_b

    .line 227
    .line 228
    new-instance v6, Landroid/os/Bundle;

    .line 229
    .line 230
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 231
    .line 232
    .line 233
    :cond_b
    const-string v9, "android:user_visible_hint"

    .line 234
    .line 235
    iget-boolean v10, v7, LJ1/q;->W:Z

    .line 236
    .line 237
    invoke-virtual {v6, v9, v10}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 238
    .line 239
    .line 240
    :cond_c
    iput-object v6, v8, LJ1/M;->C:Landroid/os/Bundle;

    .line 241
    .line 242
    iget-object v9, v7, LJ1/q;->x:Ljava/lang/String;

    .line 243
    .line 244
    if-eqz v9, :cond_f

    .line 245
    .line 246
    if-nez v6, :cond_d

    .line 247
    .line 248
    new-instance v6, Landroid/os/Bundle;

    .line 249
    .line 250
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 251
    .line 252
    .line 253
    iput-object v6, v8, LJ1/M;->C:Landroid/os/Bundle;

    .line 254
    .line 255
    :cond_d
    iget-object v6, v8, LJ1/M;->C:Landroid/os/Bundle;

    .line 256
    .line 257
    const-string v9, "android:target_state"

    .line 258
    .line 259
    iget-object v10, v7, LJ1/q;->x:Ljava/lang/String;

    .line 260
    .line 261
    invoke-virtual {v6, v9, v10}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget v6, v7, LJ1/q;->y:I

    .line 265
    .line 266
    if-eqz v6, :cond_f

    .line 267
    .line 268
    iget-object v9, v8, LJ1/M;->C:Landroid/os/Bundle;

    .line 269
    .line 270
    const-string v10, "android:target_req_state"

    .line 271
    .line 272
    invoke-virtual {v9, v10, v6}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 273
    .line 274
    .line 275
    goto :goto_4

    .line 276
    :cond_e
    iget-object v6, v7, LJ1/q;->r:Landroid/os/Bundle;

    .line 277
    .line 278
    iput-object v6, v8, LJ1/M;->C:Landroid/os/Bundle;

    .line 279
    .line 280
    :cond_f
    :goto_4
    iget-object v5, v5, LJ1/N;->b:LE/c0;

    .line 281
    .line 282
    iget-object v6, v7, LJ1/q;->u:Ljava/lang/String;

    .line 283
    .line 284
    iget-object v5, v5, LE/c0;->s:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v5, Ljava/util/HashMap;

    .line 287
    .line 288
    invoke-virtual {v5, v6, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v5

    .line 292
    check-cast v5, LJ1/M;

    .line 293
    .line 294
    iget-object v5, v7, LJ1/q;->u:Ljava/lang/String;

    .line 295
    .line 296
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 297
    .line 298
    .line 299
    invoke-static {v4}, LJ1/H;->F(I)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-eqz v5, :cond_4

    .line 304
    .line 305
    const-string v5, "FragmentManager"

    .line 306
    .line 307
    new-instance v6, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v8, "Saved state of "

    .line 310
    .line 311
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    const-string v8, ": "

    .line 318
    .line 319
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    iget-object v7, v7, LJ1/q;->r:Landroid/os/Bundle;

    .line 323
    .line 324
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 332
    .line 333
    .line 334
    goto/16 :goto_2

    .line 335
    .line 336
    :cond_10
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    new-instance v5, Ljava/util/ArrayList;

    .line 342
    .line 343
    iget-object v1, v1, LE/c0;->s:Ljava/lang/Object;

    .line 344
    .line 345
    check-cast v1, Ljava/util/HashMap;

    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 355
    .line 356
    .line 357
    move-result v1

    .line 358
    if-eqz v1, :cond_11

    .line 359
    .line 360
    invoke-static {v4}, LJ1/H;->F(I)Z

    .line 361
    .line 362
    .line 363
    move-result v1

    .line 364
    if-eqz v1, :cond_1a

    .line 365
    .line 366
    const-string v1, "FragmentManager"

    .line 367
    .line 368
    const-string v2, "saveAllState: no fragments!"

    .line 369
    .line 370
    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 371
    .line 372
    .line 373
    return-object v0

    .line 374
    :cond_11
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 375
    .line 376
    iget-object v7, v1, LE/c0;->q:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v7, Ljava/util/ArrayList;

    .line 379
    .line 380
    monitor-enter v7

    .line 381
    :try_start_0
    iget-object v8, v1, LE/c0;->q:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v8, Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 386
    .line 387
    .line 388
    move-result v8

    .line 389
    if-eqz v8, :cond_12

    .line 390
    .line 391
    monitor-exit v7

    .line 392
    move-object v8, v6

    .line 393
    goto :goto_6

    .line 394
    :catchall_0
    move-exception v0

    .line 395
    goto/16 :goto_a

    .line 396
    .line 397
    :cond_12
    new-instance v8, Ljava/util/ArrayList;

    .line 398
    .line 399
    iget-object v9, v1, LE/c0;->q:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast v9, Ljava/util/ArrayList;

    .line 402
    .line 403
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 408
    .line 409
    .line 410
    iget-object v1, v1, LE/c0;->q:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v1, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 415
    .line 416
    .line 417
    move-result v9

    .line 418
    move v10, v3

    .line 419
    :cond_13
    :goto_5
    if-ge v10, v9, :cond_14

    .line 420
    .line 421
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v11

    .line 425
    add-int/lit8 v10, v10, 0x1

    .line 426
    .line 427
    check-cast v11, LJ1/q;

    .line 428
    .line 429
    iget-object v12, v11, LJ1/q;->u:Ljava/lang/String;

    .line 430
    .line 431
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    invoke-static {v4}, LJ1/H;->F(I)Z

    .line 435
    .line 436
    .line 437
    move-result v12

    .line 438
    if-eqz v12, :cond_13

    .line 439
    .line 440
    const-string v12, "FragmentManager"

    .line 441
    .line 442
    new-instance v13, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 445
    .line 446
    .line 447
    const-string v14, "saveAllState: adding fragment ("

    .line 448
    .line 449
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    iget-object v14, v11, LJ1/q;->u:Ljava/lang/String;

    .line 453
    .line 454
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    const-string v14, "): "

    .line 458
    .line 459
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 460
    .line 461
    .line 462
    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    .line 465
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v11

    .line 469
    invoke-static {v12, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 470
    .line 471
    .line 472
    goto :goto_5

    .line 473
    :cond_14
    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 474
    :goto_6
    iget-object v1, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 475
    .line 476
    if-eqz v1, :cond_16

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 479
    .line 480
    .line 481
    move-result v1

    .line 482
    if-lez v1, :cond_16

    .line 483
    .line 484
    new-array v7, v1, [LJ1/b;

    .line 485
    .line 486
    move v9, v3

    .line 487
    :goto_7
    if-ge v9, v1, :cond_17

    .line 488
    .line 489
    new-instance v10, LJ1/b;

    .line 490
    .line 491
    iget-object v11, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 492
    .line 493
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v11

    .line 497
    check-cast v11, LJ1/a;

    .line 498
    .line 499
    invoke-direct {v10, v11}, LJ1/b;-><init>(LJ1/a;)V

    .line 500
    .line 501
    .line 502
    aput-object v10, v7, v9

    .line 503
    .line 504
    invoke-static {v4}, LJ1/H;->F(I)Z

    .line 505
    .line 506
    .line 507
    move-result v10

    .line 508
    if-eqz v10, :cond_15

    .line 509
    .line 510
    const-string v10, "FragmentManager"

    .line 511
    .line 512
    const-string v11, "saveAllState: adding back stack #"

    .line 513
    .line 514
    const-string v12, ": "

    .line 515
    .line 516
    invoke-static {v11, v12, v9}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 517
    .line 518
    .line 519
    move-result-object v11

    .line 520
    iget-object v12, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 521
    .line 522
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v12

    .line 526
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 527
    .line 528
    .line 529
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 530
    .line 531
    .line 532
    move-result-object v11

    .line 533
    invoke-static {v10, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 534
    .line 535
    .line 536
    :cond_15
    add-int/lit8 v9, v9, 0x1

    .line 537
    .line 538
    goto :goto_7

    .line 539
    :cond_16
    move-object v7, v6

    .line 540
    :cond_17
    new-instance v1, LJ1/I;

    .line 541
    .line 542
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 543
    .line 544
    .line 545
    iput-object v6, v1, LJ1/I;->u:Ljava/lang/String;

    .line 546
    .line 547
    new-instance v4, Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 550
    .line 551
    .line 552
    iput-object v4, v1, LJ1/I;->v:Ljava/util/ArrayList;

    .line 553
    .line 554
    new-instance v6, Ljava/util/ArrayList;

    .line 555
    .line 556
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 557
    .line 558
    .line 559
    iput-object v6, v1, LJ1/I;->w:Ljava/util/ArrayList;

    .line 560
    .line 561
    iput-object v2, v1, LJ1/I;->q:Ljava/util/ArrayList;

    .line 562
    .line 563
    iput-object v8, v1, LJ1/I;->r:Ljava/util/ArrayList;

    .line 564
    .line 565
    iput-object v7, v1, LJ1/I;->s:[LJ1/b;

    .line 566
    .line 567
    iget-object v2, p0, LJ1/H;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 568
    .line 569
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 570
    .line 571
    .line 572
    move-result v2

    .line 573
    iput v2, v1, LJ1/I;->t:I

    .line 574
    .line 575
    iget-object v2, p0, LJ1/H;->w:LJ1/q;

    .line 576
    .line 577
    if-eqz v2, :cond_18

    .line 578
    .line 579
    iget-object v2, v2, LJ1/q;->u:Ljava/lang/String;

    .line 580
    .line 581
    iput-object v2, v1, LJ1/I;->u:Ljava/lang/String;

    .line 582
    .line 583
    :cond_18
    iget-object v2, p0, LJ1/H;->j:Ljava/util/Map;

    .line 584
    .line 585
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 586
    .line 587
    .line 588
    move-result-object v2

    .line 589
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 590
    .line 591
    .line 592
    iget-object v2, p0, LJ1/H;->j:Ljava/util/Map;

    .line 593
    .line 594
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 599
    .line 600
    .line 601
    new-instance v2, Ljava/util/ArrayList;

    .line 602
    .line 603
    iget-object v4, p0, LJ1/H;->C:Ljava/util/ArrayDeque;

    .line 604
    .line 605
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 606
    .line 607
    .line 608
    iput-object v2, v1, LJ1/I;->x:Ljava/util/ArrayList;

    .line 609
    .line 610
    const-string v2, "state"

    .line 611
    .line 612
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 613
    .line 614
    .line 615
    iget-object v1, p0, LJ1/H;->k:Ljava/util/Map;

    .line 616
    .line 617
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 618
    .line 619
    .line 620
    move-result-object v1

    .line 621
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    if-eqz v2, :cond_19

    .line 630
    .line 631
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v2

    .line 635
    check-cast v2, Ljava/lang/String;

    .line 636
    .line 637
    const-string v4, "result_"

    .line 638
    .line 639
    invoke-static {v4, v2}, LC0/S;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v4

    .line 643
    iget-object v6, p0, LJ1/H;->k:Ljava/util/Map;

    .line 644
    .line 645
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    check-cast v2, Landroid/os/Bundle;

    .line 650
    .line 651
    invoke-virtual {v0, v4, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 652
    .line 653
    .line 654
    goto :goto_8

    .line 655
    :cond_19
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    :goto_9
    if-ge v3, v1, :cond_1a

    .line 660
    .line 661
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v2

    .line 665
    add-int/lit8 v3, v3, 0x1

    .line 666
    .line 667
    check-cast v2, LJ1/M;

    .line 668
    .line 669
    new-instance v4, Landroid/os/Bundle;

    .line 670
    .line 671
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 672
    .line 673
    .line 674
    const-string v6, "state"

    .line 675
    .line 676
    invoke-virtual {v4, v6, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 677
    .line 678
    .line 679
    new-instance v6, Ljava/lang/StringBuilder;

    .line 680
    .line 681
    const-string v7, "fragment_"

    .line 682
    .line 683
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 684
    .line 685
    .line 686
    iget-object v2, v2, LJ1/M;->r:Ljava/lang/String;

    .line 687
    .line 688
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-virtual {v0, v2, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 696
    .line 697
    .line 698
    goto :goto_9

    .line 699
    :cond_1a
    return-object v0

    .line 700
    :goto_a
    :try_start_1
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 701
    throw v0
.end method

.method public final T()V
    .locals 3

    .line 1
    iget-object v0, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 14
    .line 15
    iget-object v1, v1, LJ1/u;->v:Landroid/os/Handler;

    .line 16
    .line 17
    iget-object v2, p0, LJ1/H;->M:LA1/b;

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 23
    .line 24
    iget-object v1, v1, LJ1/u;->v:Landroid/os/Handler;

    .line 25
    .line 26
    iget-object v2, p0, LJ1/H;->M:LA1/b;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, LJ1/H;->b0()V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    :goto_0
    monitor-exit v0

    .line 38
    return-void

    .line 39
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    throw v1
.end method

.method public final U(LJ1/q;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LJ1/H;->B(LJ1/q;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    .line 12
    .line 13
    xor-int/lit8 p2, p2, 0x1

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final V(LJ1/q;Landroidx/lifecycle/p;)V
    .locals 2

    .line 1
    iget-object v0, p1, LJ1/q;->u:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p1, LJ1/q;->I:LJ1/u;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p1, LJ1/q;->H:LJ1/H;

    .line 20
    .line 21
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    :cond_0
    iput-object p2, p1, LJ1/q;->b0:Landroidx/lifecycle/p;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v1, "Fragment "

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2
.end method

.method public final W(LJ1/q;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, LJ1/q;->u:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, LJ1/q;->I:LJ1/u;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p1, LJ1/q;->H:LJ1/H;

    .line 22
    .line 23
    if-ne v0, p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "Fragment "

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p1, " is not an active fragment of FragmentManager "

    .line 39
    .line 40
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_1
    :goto_0
    iget-object v0, p0, LJ1/H;->w:LJ1/q;

    .line 55
    .line 56
    iput-object p1, p0, LJ1/H;->w:LJ1/q;

    .line 57
    .line 58
    invoke-virtual {p0, v0}, LJ1/H;->q(LJ1/q;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, LJ1/H;->w:LJ1/q;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, LJ1/H;->q(LJ1/q;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final X(LJ1/q;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, LJ1/H;->B(LJ1/q;)Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-object v1, p1, LJ1/q;->X:LJ1/p;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move v3, v2

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v3, v1, LJ1/p;->b:I

    .line 15
    .line 16
    :goto_0
    if-nez v1, :cond_1

    .line 17
    .line 18
    move v4, v2

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    iget v4, v1, LJ1/p;->c:I

    .line 21
    .line 22
    :goto_1
    add-int/2addr v4, v3

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    move v3, v2

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    iget v3, v1, LJ1/p;->d:I

    .line 28
    .line 29
    :goto_2
    add-int/2addr v3, v4

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    move v1, v2

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    iget v1, v1, LJ1/p;->e:I

    .line 35
    .line 36
    :goto_3
    add-int/2addr v1, v3

    .line 37
    if-lez v1, :cond_7

    .line 38
    .line 39
    const v1, 0x7f090213

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    if-nez v3, :cond_4

    .line 47
    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, LJ1/q;

    .line 56
    .line 57
    iget-object p1, p1, LJ1/q;->X:LJ1/p;

    .line 58
    .line 59
    if-nez p1, :cond_5

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_5
    iget-boolean v2, p1, LJ1/p;->a:Z

    .line 63
    .line 64
    :goto_4
    iget-object p1, v0, LJ1/q;->X:LJ1/p;

    .line 65
    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_6
    invoke-virtual {v0}, LJ1/q;->g()LJ1/p;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-boolean v2, p1, LJ1/p;->a:Z

    .line 74
    .line 75
    :cond_7
    :goto_5
    return-void
.end method

.method public final Z()V
    .locals 7

    .line 1
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/c0;->o()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :cond_0
    :goto_0
    if-ge v3, v1, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    add-int/lit8 v3, v3, 0x1

    .line 20
    .line 21
    check-cast v4, LJ1/N;

    .line 22
    .line 23
    iget-object v5, v4, LJ1/N;->c:LJ1/q;

    .line 24
    .line 25
    iget-boolean v6, v5, LJ1/q;->V:Z

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-boolean v6, p0, LJ1/H;->b:Z

    .line 30
    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    iput-boolean v4, p0, LJ1/H;->H:Z

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iput-boolean v2, v5, LJ1/q;->V:Z

    .line 38
    .line 39
    invoke-virtual {v4}, LJ1/N;->k()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    return-void
.end method

.method public final a(LJ1/q;)LJ1/N;
    .locals 3

    .line 1
    iget-object v0, p1, LJ1/q;->a0:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1, v0}, LK1/d;->c(LJ1/q;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x2

    .line 9
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "add: "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "FragmentManager"

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0, p1}, LJ1/H;->f(LJ1/q;)LJ1/N;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object p0, p1, LJ1/q;->H:LJ1/H;

    .line 39
    .line 40
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, LE/c0;->w(LJ1/N;)V

    .line 43
    .line 44
    .line 45
    iget-boolean v2, p1, LJ1/q;->P:Z

    .line 46
    .line 47
    if-nez v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {v1, p1}, LE/c0;->c(LJ1/q;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    iput-boolean v1, p1, LJ1/q;->B:Z

    .line 54
    .line 55
    iget-object v2, p1, LJ1/q;->U:Landroid/view/View;

    .line 56
    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    iput-boolean v1, p1, LJ1/q;->Y:Z

    .line 60
    .line 61
    :cond_2
    invoke-static {p1}, LJ1/H;->G(LJ1/q;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    iput-boolean p1, p0, LJ1/H;->D:Z

    .line 69
    .line 70
    :cond_3
    return-object v0
.end method

.method public final a0(Ljava/lang/IllegalStateException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "FragmentManager"

    .line 6
    .line 7
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    const-string v0, "Activity state:"

    .line 11
    .line 12
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 13
    .line 14
    .line 15
    new-instance v0, LJ1/Q;

    .line 16
    .line 17
    invoke-direct {v0}, LJ1/Q;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljava/io/PrintWriter;

    .line 21
    .line 22
    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 26
    .line 27
    const-string v3, "Failed dumping state"

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    const/4 v5, 0x0

    .line 31
    const-string v6, "  "

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, v0, LJ1/u;->x:Lh/h;

    .line 38
    .line 39
    invoke-virtual {v0, v6, v5, v2, v4}, Lh/h;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, v6, v5, v2, v0}, LJ1/H;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_1
    move-exception v0

    .line 55
    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 56
    .line 57
    .line 58
    :goto_0
    throw p1
.end method

.method public final b(LJ1/u;LC3/a;LJ1/q;)V
    .locals 4

    .line 1
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 2
    .line 3
    if-nez v0, :cond_13

    .line 4
    .line 5
    iput-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 6
    .line 7
    iput-object p2, p0, LJ1/H;->u:LC3/a;

    .line 8
    .line 9
    iput-object p3, p0, LJ1/H;->v:LJ1/q;

    .line 10
    .line 11
    iget-object p2, p0, LJ1/H;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    new-instance v0, LJ1/C;

    .line 16
    .line 17
    invoke-direct {v0, p3}, LJ1/C;-><init>(LJ1/q;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object p2, p0, LJ1/H;->v:LJ1/q;

    .line 30
    .line 31
    if-eqz p2, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, LJ1/H;->b0()V

    .line 34
    .line 35
    .line 36
    :cond_2
    if-eqz p1, :cond_4

    .line 37
    .line 38
    iget-object p2, p1, LJ1/u;->x:Lh/h;

    .line 39
    .line 40
    invoke-virtual {p2}, Lb/l;->a()Lb/A;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    iput-object p2, p0, LJ1/H;->g:Lb/A;

    .line 45
    .line 46
    if-eqz p3, :cond_3

    .line 47
    .line 48
    move-object v0, p3

    .line 49
    goto :goto_1

    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :goto_1
    iget-object v1, p0, LJ1/H;->h:LJ1/z;

    .line 52
    .line 53
    invoke-virtual {p2, v0, v1}, Lb/A;->a(Landroidx/lifecycle/x;Lb/u;)V

    .line 54
    .line 55
    .line 56
    :cond_4
    const/4 p2, 0x0

    .line 57
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object p1, p3, LJ1/q;->H:LJ1/H;

    .line 60
    .line 61
    iget-object p1, p1, LJ1/H;->L:LJ1/K;

    .line 62
    .line 63
    iget-object v0, p1, LJ1/K;->c:Ljava/util/HashMap;

    .line 64
    .line 65
    iget-object v1, p3, LJ1/q;->u:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, LJ1/K;

    .line 72
    .line 73
    if-nez v1, :cond_5

    .line 74
    .line 75
    new-instance v1, LJ1/K;

    .line 76
    .line 77
    iget-boolean p1, p1, LJ1/K;->e:Z

    .line 78
    .line 79
    invoke-direct {v1, p1}, LJ1/K;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-object p1, p3, LJ1/q;->u:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_5
    iput-object v1, p0, LJ1/H;->L:LJ1/K;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    if-eqz p1, :cond_8

    .line 91
    .line 92
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 93
    .line 94
    invoke-virtual {p1}, Lb/l;->f()Landroidx/lifecycle/k0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object v0, LP1/a;->b:LP1/a;

    .line 99
    .line 100
    const-string v1, "defaultCreationExtras"

    .line 101
    .line 102
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, LE/c0;

    .line 106
    .line 107
    sget-object v2, LJ1/K;->h:LJ1/J;

    .line 108
    .line 109
    invoke-direct {v1, p1, v2, v0}, LE/c0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;LP1/c;)V

    .line 110
    .line 111
    .line 112
    const-class p1, LJ1/K;

    .line 113
    .line 114
    invoke-static {p1}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Lkotlin/jvm/internal/f;->b()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 125
    .line 126
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v1, v0, p1}, LE/c0;->v(Ljava/lang/String;Lkotlin/jvm/internal/f;)Landroidx/lifecycle/f0;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, LJ1/K;

    .line 135
    .line 136
    iput-object p1, p0, LJ1/H;->L:LJ1/K;

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    const-string p2, "Local and anonymous classes can not be ViewModels"

    .line 142
    .line 143
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_8
    new-instance p1, LJ1/K;

    .line 148
    .line 149
    invoke-direct {p1, p2}, LJ1/K;-><init>(Z)V

    .line 150
    .line 151
    .line 152
    iput-object p1, p0, LJ1/H;->L:LJ1/K;

    .line 153
    .line 154
    :goto_2
    iget-object p1, p0, LJ1/H;->L:LJ1/K;

    .line 155
    .line 156
    iget-boolean v0, p0, LJ1/H;->E:Z

    .line 157
    .line 158
    if-nez v0, :cond_9

    .line 159
    .line 160
    iget-boolean v0, p0, LJ1/H;->F:Z

    .line 161
    .line 162
    if-eqz v0, :cond_a

    .line 163
    .line 164
    :cond_9
    const/4 p2, 0x1

    .line 165
    :cond_a
    iput-boolean p2, p1, LJ1/K;->g:Z

    .line 166
    .line 167
    iget-object p2, p0, LJ1/H;->c:LE/c0;

    .line 168
    .line 169
    iput-object p1, p2, LE/c0;->t:Ljava/lang/Object;

    .line 170
    .line 171
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 172
    .line 173
    if-eqz p1, :cond_b

    .line 174
    .line 175
    if-nez p3, :cond_b

    .line 176
    .line 177
    invoke-virtual {p1}, LJ1/u;->b()LZ/m;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    new-instance p2, LC0/x0;

    .line 182
    .line 183
    const/4 v0, 0x1

    .line 184
    invoke-direct {p2, v0, p0}, LC0/x0;-><init>(ILjava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    const-string v0, "android:support:fragments"

    .line 188
    .line 189
    invoke-virtual {p1, v0, p2}, LZ/m;->C(Ljava/lang/String;Lg2/d;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, LZ/m;->h(Ljava/lang/String;)Landroid/os/Bundle;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-eqz p1, :cond_b

    .line 197
    .line 198
    invoke-virtual {p0, p1}, LJ1/H;->R(Landroid/os/Parcelable;)V

    .line 199
    .line 200
    .line 201
    :cond_b
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 202
    .line 203
    if-eqz p1, :cond_d

    .line 204
    .line 205
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 206
    .line 207
    iget-object p1, p1, Lb/l;->y:Lb/j;

    .line 208
    .line 209
    if-eqz p3, :cond_c

    .line 210
    .line 211
    new-instance p2, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    iget-object v0, p3, LJ1/q;->u:Ljava/lang/String;

    .line 217
    .line 218
    const-string v1, ":"

    .line 219
    .line 220
    invoke-static {p2, v0, v1}, Lk1/i;->k(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    goto :goto_3

    .line 225
    :cond_c
    const-string p2, ""

    .line 226
    .line 227
    :goto_3
    const-string v0, "FragmentManager:"

    .line 228
    .line 229
    invoke-static {v0, p2}, LC0/S;->w(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    const-string v0, "StartActivityForResult"

    .line 234
    .line 235
    invoke-static {p2, v0}, LC0/S;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v1, LJ1/D;

    .line 240
    .line 241
    const/4 v2, 0x7

    .line 242
    invoke-direct {v1, v2}, LJ1/D;-><init>(I)V

    .line 243
    .line 244
    .line 245
    new-instance v2, Lk3/d;

    .line 246
    .line 247
    const/4 v3, 0x6

    .line 248
    invoke-direct {v2, v3, p0}, Lk3/d;-><init>(ILjava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v0, v1, v2}, Lb/j;->c(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    iput-object v0, p0, LJ1/H;->z:Le/g;

    .line 256
    .line 257
    const-string v0, "StartIntentSenderForResult"

    .line 258
    .line 259
    invoke-static {p2, v0}, LC0/S;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    new-instance v1, LJ1/D;

    .line 264
    .line 265
    const/4 v2, 0x0

    .line 266
    invoke-direct {v1, v2}, LJ1/D;-><init>(I)V

    .line 267
    .line 268
    .line 269
    new-instance v2, LJ1/y;

    .line 270
    .line 271
    const/4 v3, 0x1

    .line 272
    invoke-direct {v2, p0, v3}, LJ1/y;-><init>(LJ1/H;I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1, v0, v1, v2}, Lb/j;->c(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    iput-object v0, p0, LJ1/H;->A:Le/g;

    .line 280
    .line 281
    const-string v0, "RequestPermissions"

    .line 282
    .line 283
    invoke-static {p2, v0}, LC0/S;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p2

    .line 287
    new-instance v0, LJ1/D;

    .line 288
    .line 289
    const/4 v1, 0x5

    .line 290
    invoke-direct {v0, v1}, LJ1/D;-><init>(I)V

    .line 291
    .line 292
    .line 293
    new-instance v1, LJ1/y;

    .line 294
    .line 295
    const/4 v2, 0x0

    .line 296
    invoke-direct {v1, p0, v2}, LJ1/y;-><init>(LJ1/H;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, p2, v0, v1}, Lb/j;->c(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/I1;Le/b;)Le/g;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    iput-object p1, p0, LJ1/H;->B:Le/g;

    .line 304
    .line 305
    :cond_d
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 306
    .line 307
    if-eqz p1, :cond_e

    .line 308
    .line 309
    iget-object p2, p0, LJ1/H;->n:LJ1/x;

    .line 310
    .line 311
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 312
    .line 313
    invoke-virtual {p1, p2}, Lb/l;->h(Lv1/a;)V

    .line 314
    .line 315
    .line 316
    :cond_e
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 317
    .line 318
    if-eqz p1, :cond_f

    .line 319
    .line 320
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 321
    .line 322
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    const-string p2, "listener"

    .line 326
    .line 327
    iget-object v0, p0, LJ1/H;->o:LJ1/x;

    .line 328
    .line 329
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object p1, p1, Lb/l;->A:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 333
    .line 334
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    :cond_f
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 338
    .line 339
    if-eqz p1, :cond_10

    .line 340
    .line 341
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    const-string p2, "listener"

    .line 347
    .line 348
    iget-object v0, p0, LJ1/H;->p:LJ1/x;

    .line 349
    .line 350
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    iget-object p1, p1, Lb/l;->C:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 354
    .line 355
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    :cond_10
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 359
    .line 360
    if-eqz p1, :cond_11

    .line 361
    .line 362
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    const-string p2, "listener"

    .line 368
    .line 369
    iget-object v0, p0, LJ1/H;->q:LJ1/x;

    .line 370
    .line 371
    invoke-static {v0, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    iget-object p1, p1, Lb/l;->D:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 375
    .line 376
    invoke-virtual {p1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    :cond_11
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 380
    .line 381
    if-eqz p1, :cond_12

    .line 382
    .line 383
    if-nez p3, :cond_12

    .line 384
    .line 385
    iget-object p1, p1, LJ1/u;->x:Lh/h;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    const-string p2, "provider"

    .line 391
    .line 392
    iget-object p3, p0, LJ1/H;->r:LJ1/A;

    .line 393
    .line 394
    invoke-static {p3, p2}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    iget-object p1, p1, Lb/l;->s:Lt2/e;

    .line 398
    .line 399
    iget-object p2, p1, Lt2/e;->r:Ljava/lang/Object;

    .line 400
    .line 401
    check-cast p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 402
    .line 403
    invoke-virtual {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    iget-object p1, p1, Lt2/e;->q:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p1, Ljava/lang/Runnable;

    .line 409
    .line 410
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 411
    .line 412
    .line 413
    :cond_12
    return-void

    .line 414
    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 415
    .line 416
    const-string p2, "Already attached"

    .line 417
    .line 418
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw p1
.end method

.method public final b0()V
    .locals 4

    .line 1
    iget-object v0, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v1, p0, LJ1/H;->h:LJ1/z;

    .line 14
    .line 15
    iput-boolean v2, v1, Lb/u;->a:Z

    .line 16
    .line 17
    iget-object v1, v1, Lb/u;->c:Lkotlin/jvm/internal/k;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, LB5/a;->invoke()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    goto :goto_2

    .line 28
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, LJ1/H;->h:LJ1/z;

    .line 30
    .line 31
    iget-object v1, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_0
    if-lez v1, :cond_3

    .line 43
    .line 44
    iget-object v1, p0, LJ1/H;->v:LJ1/q;

    .line 45
    .line 46
    invoke-static {v1}, LJ1/H;->J(LJ1/q;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    move v2, v3

    .line 54
    :goto_1
    iput-boolean v2, v0, Lb/u;->a:Z

    .line 55
    .line 56
    iget-object v0, v0, Lb/u;->c:Lkotlin/jvm/internal/k;

    .line 57
    .line 58
    if-eqz v0, :cond_4

    .line 59
    .line 60
    invoke-interface {v0}, LB5/a;->invoke()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_4
    return-void

    .line 64
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw v1
.end method

.method public final c(LJ1/q;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

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
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "attach: "

    .line 13
    .line 14
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v1, p1, LJ1/q;->P:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, p1, LJ1/q;->P:Z

    .line 33
    .line 34
    iget-boolean v1, p1, LJ1/q;->A:Z

    .line 35
    .line 36
    if-nez v1, :cond_2

    .line 37
    .line 38
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 39
    .line 40
    invoke-virtual {v1, p1}, LE/c0;->c(LJ1/q;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, LJ1/H;->F(I)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v1, "add from attach: "

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v2, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {p1}, LJ1/H;->G(LJ1/q;)Z

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, LJ1/H;->D:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LJ1/H;->b:Z

    .line 3
    .line 4
    iget-object v0, p0, LJ1/H;->J:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LJ1/H;->I:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 6

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 7
    .line 8
    invoke-virtual {v1}, LE/c0;->o()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    :cond_0
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, LJ1/N;

    .line 26
    .line 27
    iget-object v4, v4, LJ1/N;->c:LJ1/q;

    .line 28
    .line 29
    iget-object v4, v4, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, LJ1/H;->D()Lx3/k;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-static {v4, v5}, LJ1/h;->f(Landroid/view/ViewGroup;Lx3/k;)LJ1/h;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-object v0
.end method

.method public final f(LJ1/q;)LJ1/N;
    .locals 3

    .line 1
    iget-object v0, p1, LJ1/q;->u:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 4
    .line 5
    iget-object v2, v1, LE/c0;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, LJ1/N;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    new-instance v0, LJ1/N;

    .line 19
    .line 20
    iget-object v2, p0, LJ1/H;->l:LB0/o;

    .line 21
    .line 22
    invoke-direct {v0, v2, v1, p1}, LJ1/N;-><init>(LB0/o;LE/c0;LJ1/q;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LJ1/H;->t:LJ1/u;

    .line 26
    .line 27
    iget-object p1, p1, LJ1/u;->u:Lh/h;

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, LJ1/N;->m(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iget p1, p0, LJ1/H;->s:I

    .line 37
    .line 38
    iput p1, v0, LJ1/N;->e:I

    .line 39
    .line 40
    return-object v0
.end method

.method public final g(LJ1/q;)V
    .locals 4

    .line 1
    const-string v0, "FragmentManager"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v1}, LJ1/H;->F(I)Z

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v3, "detach: "

    .line 13
    .line 14
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    .line 26
    .line 27
    :cond_0
    iget-boolean v2, p1, LJ1/q;->P:Z

    .line 28
    .line 29
    if-nez v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    iput-boolean v2, p1, LJ1/q;->P:Z

    .line 33
    .line 34
    iget-boolean v3, p1, LJ1/q;->A:Z

    .line 35
    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    invoke-static {v1}, LJ1/H;->F(I)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v3, "remove from detach: "

    .line 47
    .line 48
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_1
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 62
    .line 63
    iget-object v1, v0, LE/c0;->q:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    monitor-enter v1

    .line 68
    :try_start_0
    iget-object v0, v0, LE/c0;->q:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p1, LJ1/q;->A:Z

    .line 78
    .line 79
    invoke-static {p1}, LJ1/H;->G(LJ1/q;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p0, LJ1/H;->D:Z

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p0, p1}, LJ1/H;->X(LJ1/q;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1

    .line 94
    :cond_3
    return-void
.end method

.method public final h(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, LJ1/H;->a0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 21
    .line 22
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LJ1/q;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, v1, LJ1/q;->S:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, LJ1/H;->h(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final i()Z
    .locals 5

    .line 1
    iget v0, p0, LJ1/H;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 9
    .line 10
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, LJ1/q;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, LJ1/q;->O:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, LJ1/q;->J:LJ1/H;

    .line 37
    .line 38
    invoke-virtual {v3}, LJ1/H;->i()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final j()Z
    .locals 7

    .line 1
    iget v0, p0, LJ1/H;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 9
    .line 10
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v1

    .line 20
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, LJ1/q;

    .line 31
    .line 32
    if-eqz v5, :cond_1

    .line 33
    .line 34
    invoke-static {v5}, LJ1/H;->I(LJ1/q;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    iget-boolean v6, v5, LJ1/q;->O:Z

    .line 41
    .line 42
    if-nez v6, :cond_2

    .line 43
    .line 44
    iget-object v6, v5, LJ1/q;->J:LJ1/H;

    .line 45
    .line 46
    invoke-virtual {v6}, LJ1/H;->j()Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move v6, v1

    .line 52
    :goto_1
    if-eqz v6, :cond_1

    .line 53
    .line 54
    if-nez v3, :cond_3

    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move v4, v2

    .line 65
    goto :goto_0

    .line 66
    :cond_4
    iget-object v0, p0, LJ1/H;->e:Ljava/util/ArrayList;

    .line 67
    .line 68
    if-eqz v0, :cond_7

    .line 69
    .line 70
    :goto_2
    iget-object v0, p0, LJ1/H;->e:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-ge v1, v0, :cond_7

    .line 77
    .line 78
    iget-object v0, p0, LJ1/H;->e:Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, LJ1/q;

    .line 85
    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_7
    iput-object v3, p0, LJ1/H;->e:Ljava/util/ArrayList;

    .line 101
    .line 102
    return v4
.end method

.method public final k()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LJ1/H;->G:Z

    .line 3
    .line 4
    invoke-virtual {p0, v0}, LJ1/H;->y(Z)Z

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, LJ1/H;->e()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, LJ1/h;

    .line 26
    .line 27
    invoke-virtual {v2}, LJ1/h;->e()V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 32
    .line 33
    iget-object v2, p0, LJ1/H;->c:LE/c0;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iget-object v0, v2, LE/c0;->t:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, LJ1/K;

    .line 40
    .line 41
    iget-boolean v0, v0, LJ1/K;->f:Z

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    iget-object v1, v1, LJ1/u;->u:Lh/h;

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    xor-int/2addr v0, v1

    .line 53
    :cond_2
    :goto_1
    if-eqz v0, :cond_5

    .line 54
    .line 55
    iget-object v0, p0, LJ1/H;->j:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_5

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, LJ1/c;

    .line 76
    .line 77
    iget-object v1, v1, LJ1/c;->q:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v4, 0x0

    .line 84
    :goto_2
    if-ge v4, v3, :cond_3

    .line 85
    .line 86
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    add-int/lit8 v4, v4, 0x1

    .line 91
    .line 92
    check-cast v5, Ljava/lang/String;

    .line 93
    .line 94
    iget-object v6, v2, LE/c0;->t:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v6, LJ1/K;

    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const/4 v7, 0x3

    .line 102
    invoke-static {v7}, LJ1/H;->F(I)Z

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    if-eqz v7, :cond_4

    .line 107
    .line 108
    new-instance v7, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    const-string v8, "Clearing non-config state for saved state of Fragment "

    .line 111
    .line 112
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    const-string v8, "FragmentManager"

    .line 123
    .line 124
    invoke-static {v8, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    :cond_4
    invoke-virtual {v6, v5}, LJ1/K;->d(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    const/4 v0, -0x1

    .line 132
    invoke-virtual {p0, v0}, LJ1/H;->t(I)V

    .line 133
    .line 134
    .line 135
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    iget-object v0, v0, LJ1/u;->x:Lh/h;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    const-string v1, "listener"

    .line 145
    .line 146
    iget-object v2, p0, LJ1/H;->o:LJ1/x;

    .line 147
    .line 148
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, v0, Lb/l;->A:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 152
    .line 153
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    :cond_6
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 157
    .line 158
    if-eqz v0, :cond_7

    .line 159
    .line 160
    iget-object v0, v0, LJ1/u;->x:Lh/h;

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const-string v1, "listener"

    .line 166
    .line 167
    iget-object v2, p0, LJ1/H;->n:LJ1/x;

    .line 168
    .line 169
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v0, Lb/l;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 173
    .line 174
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    :cond_7
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 178
    .line 179
    if-eqz v0, :cond_8

    .line 180
    .line 181
    iget-object v0, v0, LJ1/u;->x:Lh/h;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    const-string v1, "listener"

    .line 187
    .line 188
    iget-object v2, p0, LJ1/H;->p:LJ1/x;

    .line 189
    .line 190
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    iget-object v0, v0, Lb/l;->C:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 194
    .line 195
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    :cond_8
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 199
    .line 200
    if-eqz v0, :cond_9

    .line 201
    .line 202
    iget-object v0, v0, LJ1/u;->x:Lh/h;

    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    const-string v1, "listener"

    .line 208
    .line 209
    iget-object v2, p0, LJ1/H;->q:LJ1/x;

    .line 210
    .line 211
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget-object v0, v0, Lb/l;->D:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 215
    .line 216
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    :cond_9
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 220
    .line 221
    if-eqz v0, :cond_b

    .line 222
    .line 223
    iget-object v0, v0, LJ1/u;->x:Lh/h;

    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    const-string v1, "provider"

    .line 229
    .line 230
    iget-object v2, p0, LJ1/H;->r:LJ1/A;

    .line 231
    .line 232
    invoke-static {v2, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    iget-object v0, v0, Lb/l;->s:Lt2/e;

    .line 236
    .line 237
    iget-object v1, v0, Lt2/e;->r:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 240
    .line 241
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    iget-object v1, v0, Lt2/e;->s:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast v1, Ljava/util/HashMap;

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    if-nez v1, :cond_a

    .line 253
    .line 254
    iget-object v0, v0, Lt2/e;->q:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v0, Ljava/lang/Runnable;

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_a
    new-instance v0, Ljava/lang/ClassCastException;

    .line 263
    .line 264
    invoke-direct {v0}, Ljava/lang/ClassCastException;-><init>()V

    .line 265
    .line 266
    .line 267
    throw v0

    .line 268
    :cond_b
    :goto_3
    const/4 v0, 0x0

    .line 269
    iput-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 270
    .line 271
    iput-object v0, p0, LJ1/H;->u:LC3/a;

    .line 272
    .line 273
    iput-object v0, p0, LJ1/H;->v:LJ1/q;

    .line 274
    .line 275
    iget-object v1, p0, LJ1/H;->g:Lb/A;

    .line 276
    .line 277
    if-eqz v1, :cond_c

    .line 278
    .line 279
    iget-object v1, p0, LJ1/H;->h:LJ1/z;

    .line 280
    .line 281
    invoke-virtual {v1}, Lb/u;->e()V

    .line 282
    .line 283
    .line 284
    iput-object v0, p0, LJ1/H;->g:Lb/A;

    .line 285
    .line 286
    :cond_c
    iget-object v0, p0, LJ1/H;->z:Le/g;

    .line 287
    .line 288
    if-eqz v0, :cond_d

    .line 289
    .line 290
    iget-object v1, v0, Le/g;->e:Lb/j;

    .line 291
    .line 292
    iget-object v0, v0, Le/g;->f:Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {v1, v0}, Lb/j;->e(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    iget-object v0, p0, LJ1/H;->A:Le/g;

    .line 298
    .line 299
    iget-object v1, v0, Le/g;->e:Lb/j;

    .line 300
    .line 301
    iget-object v0, v0, Le/g;->f:Ljava/lang/String;

    .line 302
    .line 303
    invoke-virtual {v1, v0}, Lb/j;->e(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, p0, LJ1/H;->B:Le/g;

    .line 307
    .line 308
    iget-object v1, v0, Le/g;->e:Lb/j;

    .line 309
    .line 310
    iget-object v0, v0, Le/g;->f:Ljava/lang/String;

    .line 311
    .line 312
    invoke-virtual {v1, v0}, Lb/j;->e(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    :cond_d
    return-void
.end method

.method public final l(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, LJ1/H;->a0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 21
    .line 22
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LJ1/q;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    iput-boolean v2, v1, LJ1/q;->S:Z

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 50
    .line 51
    invoke-virtual {v1, v2}, LJ1/H;->l(Z)V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    return-void
.end method

.method public final m(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, LJ1/H;->a0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 21
    .line 22
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LJ1/q;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, LJ1/H;->m(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final n()V
    .locals 4

    .line 1
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/c0;->q()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    check-cast v3, LJ1/q;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    invoke-virtual {v3}, LJ1/q;->n()Z

    .line 25
    .line 26
    .line 27
    iget-object v3, v3, LJ1/q;->J:LJ1/H;

    .line 28
    .line 29
    invoke-virtual {v3}, LJ1/H;->n()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 5

    .line 1
    iget v0, p0, LJ1/H;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 9
    .line 10
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-eqz v3, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, LJ1/q;

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v4, v3, LJ1/q;->O:Z

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    iget-object v3, v3, LJ1/q;->J:LJ1/H;

    .line 37
    .line 38
    invoke-virtual {v3}, LJ1/H;->o()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    move v3, v1

    .line 44
    :goto_0
    if-eqz v3, :cond_1

    .line 45
    .line 46
    return v2

    .line 47
    :cond_3
    :goto_1
    return v1
.end method

.method public final p()V
    .locals 3

    .line 1
    iget v0, p0, LJ1/H;->s:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 8
    .line 9
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, LJ1/q;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-boolean v2, v1, LJ1/q;->O:Z

    .line 32
    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 36
    .line 37
    invoke-virtual {v1}, LJ1/H;->p()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    :goto_1
    return-void
.end method

.method public final q(LJ1/q;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, LJ1/q;->u:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, LJ1/q;->H:LJ1/H;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, LJ1/H;->J(LJ1/q;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v1, p1, LJ1/q;->z:Ljava/lang/Boolean;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eq v1, v0, :cond_1

    .line 35
    .line 36
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p1, LJ1/q;->z:Ljava/lang/Boolean;

    .line 41
    .line 42
    iget-object p1, p1, LJ1/q;->J:LJ1/H;

    .line 43
    .line 44
    invoke-virtual {p1}, LJ1/H;->b0()V

    .line 45
    .line 46
    .line 47
    iget-object v0, p1, LJ1/H;->w:LJ1/q;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, LJ1/H;->q(LJ1/q;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    return-void
.end method

.method public final r(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v0, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, LJ1/H;->a0(Ljava/lang/IllegalStateException;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    throw p1

    .line 20
    :cond_1
    :goto_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 21
    .line 22
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, LJ1/q;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    iget-object v1, v1, LJ1/q;->J:LJ1/H;

    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, LJ1/H;->r(Z)V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    return-void
.end method

.method public final s()Z
    .locals 6

    .line 1
    iget v0, p0, LJ1/H;->s:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    iget-object v0, p0, LJ1/H;->c:LE/c0;

    .line 9
    .line 10
    invoke-virtual {v0}, LE/c0;->s()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move v3, v1

    .line 19
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, LJ1/q;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-static {v4}, LJ1/H;->I(LJ1/q;)Z

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    if-eqz v5, :cond_1

    .line 38
    .line 39
    iget-boolean v5, v4, LJ1/q;->O:Z

    .line 40
    .line 41
    if-nez v5, :cond_2

    .line 42
    .line 43
    iget-object v4, v4, LJ1/q;->J:LJ1/H;

    .line 44
    .line 45
    invoke-virtual {v4}, LJ1/H;->s()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v4, v1

    .line 51
    :goto_1
    if-eqz v4, :cond_1

    .line 52
    .line 53
    move v3, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    return v3
.end method

.method public final t(I)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iput-boolean v0, p0, LJ1/H;->b:Z

    .line 4
    .line 5
    iget-object v2, p0, LJ1/H;->c:LE/c0;

    .line 6
    .line 7
    iget-object v2, v2, LE/c0;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, LJ1/N;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    iput p1, v3, LJ1/N;->e:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {p0, p1, v1}, LJ1/H;->K(IZ)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, LJ1/H;->e()Ljava/util/HashSet;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    check-cast v2, LJ1/h;

    .line 58
    .line 59
    invoke-virtual {v2}, LJ1/h;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iput-boolean v1, p0, LJ1/H;->b:Z

    .line 66
    .line 67
    invoke-virtual {p0, v0}, LJ1/H;->y(Z)Z

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :goto_2
    iput-boolean v1, p0, LJ1/H;->b:Z

    .line 72
    .line 73
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "FragmentManager{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string v1, " in "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, LJ1/H;->v:LJ1/q;

    .line 30
    .line 31
    const-string v2, "}"

    .line 32
    .line 33
    const-string v3, "{"

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, LJ1/H;->v:LJ1/q;

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 87
    .line 88
    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    const-string v1, "null"

    .line 104
    .line 105
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    :goto_0
    const-string v1, "}}"

    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    return-object v0
.end method

.method public final u()V
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ1/H;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, LJ1/H;->H:Z

    .line 7
    .line 8
    invoke-virtual {p0}, LJ1/H;->Z()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 11

    .line 1
    const-string v0, "    "

    .line 2
    .line 3
    invoke-static {p1, v0}, LC0/S;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LJ1/H;->c:LE/c0;

    .line 8
    .line 9
    iget-object v2, v1, LE/c0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    const-string v3, "    "

    .line 14
    .line 15
    invoke-static {p1, v3}, LC0/S;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v1, v1, LE/c0;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/HashMap;->isEmpty()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_1e

    .line 28
    .line 29
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v4, "Active Fragments:"

    .line 33
    .line 34
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_1e

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, LJ1/N;

    .line 56
    .line 57
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-eqz v4, :cond_1d

    .line 61
    .line 62
    iget-object v4, v4, LJ1/N;->c:LJ1/q;

    .line 63
    .line 64
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v5, "mFragmentId=#"

    .line 74
    .line 75
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget v5, v4, LJ1/q;->L:I

    .line 79
    .line 80
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const-string v5, " mContainerId=#"

    .line 88
    .line 89
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    iget v5, v4, LJ1/q;->M:I

    .line 93
    .line 94
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v5, " mTag="

    .line 102
    .line 103
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v5, v4, LJ1/q;->N:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    const-string v5, "mState="

    .line 115
    .line 116
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    iget v5, v4, LJ1/q;->q:I

    .line 120
    .line 121
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    .line 122
    .line 123
    .line 124
    const-string v5, " mWho="

    .line 125
    .line 126
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    iget-object v5, v4, LJ1/q;->u:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v5, " mBackStackNesting="

    .line 135
    .line 136
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget v5, v4, LJ1/q;->G:I

    .line 140
    .line 141
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    const-string v5, "mAdded="

    .line 148
    .line 149
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v5, v4, LJ1/q;->A:Z

    .line 153
    .line 154
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 155
    .line 156
    .line 157
    const-string v5, " mRemoving="

    .line 158
    .line 159
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-boolean v5, v4, LJ1/q;->B:Z

    .line 163
    .line 164
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 165
    .line 166
    .line 167
    const-string v5, " mFromLayout="

    .line 168
    .line 169
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    iget-boolean v5, v4, LJ1/q;->C:Z

    .line 173
    .line 174
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 175
    .line 176
    .line 177
    const-string v5, " mInLayout="

    .line 178
    .line 179
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    iget-boolean v5, v4, LJ1/q;->D:Z

    .line 183
    .line 184
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    const-string v5, "mHidden="

    .line 191
    .line 192
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    iget-boolean v5, v4, LJ1/q;->O:Z

    .line 196
    .line 197
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 198
    .line 199
    .line 200
    const-string v5, " mDetached="

    .line 201
    .line 202
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    iget-boolean v5, v4, LJ1/q;->P:Z

    .line 206
    .line 207
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 208
    .line 209
    .line 210
    const-string v5, " mMenuVisible="

    .line 211
    .line 212
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-boolean v5, v4, LJ1/q;->R:Z

    .line 216
    .line 217
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Z)V

    .line 218
    .line 219
    .line 220
    const-string v5, " mHasMenu="

    .line 221
    .line 222
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    const-string v6, "mRetainInstance="

    .line 233
    .line 234
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    iget-boolean v6, v4, LJ1/q;->Q:Z

    .line 238
    .line 239
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    .line 240
    .line 241
    .line 242
    const-string v6, " mUserVisibleHint="

    .line 243
    .line 244
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    iget-boolean v6, v4, LJ1/q;->W:Z

    .line 248
    .line 249
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 250
    .line 251
    .line 252
    iget-object v6, v4, LJ1/q;->H:LJ1/H;

    .line 253
    .line 254
    if-eqz v6, :cond_0

    .line 255
    .line 256
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const-string v6, "mFragmentManager="

    .line 260
    .line 261
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-object v6, v4, LJ1/q;->H:LJ1/H;

    .line 265
    .line 266
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_0
    iget-object v6, v4, LJ1/q;->I:LJ1/u;

    .line 270
    .line 271
    if-eqz v6, :cond_1

    .line 272
    .line 273
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    const-string v6, "mHost="

    .line 277
    .line 278
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    iget-object v6, v4, LJ1/q;->I:LJ1/u;

    .line 282
    .line 283
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    :cond_1
    iget-object v6, v4, LJ1/q;->K:LJ1/q;

    .line 287
    .line 288
    if-eqz v6, :cond_2

    .line 289
    .line 290
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    const-string v6, "mParentFragment="

    .line 294
    .line 295
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 296
    .line 297
    .line 298
    iget-object v6, v4, LJ1/q;->K:LJ1/q;

    .line 299
    .line 300
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    :cond_2
    iget-object v6, v4, LJ1/q;->v:Landroid/os/Bundle;

    .line 304
    .line 305
    if-eqz v6, :cond_3

    .line 306
    .line 307
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    const-string v6, "mArguments="

    .line 311
    .line 312
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 313
    .line 314
    .line 315
    iget-object v6, v4, LJ1/q;->v:Landroid/os/Bundle;

    .line 316
    .line 317
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_3
    iget-object v6, v4, LJ1/q;->r:Landroid/os/Bundle;

    .line 321
    .line 322
    if-eqz v6, :cond_4

    .line 323
    .line 324
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    const-string v6, "mSavedFragmentState="

    .line 328
    .line 329
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    iget-object v6, v4, LJ1/q;->r:Landroid/os/Bundle;

    .line 333
    .line 334
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    :cond_4
    iget-object v6, v4, LJ1/q;->s:Landroid/util/SparseArray;

    .line 338
    .line 339
    if-eqz v6, :cond_5

    .line 340
    .line 341
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v6, "mSavedViewState="

    .line 345
    .line 346
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    iget-object v6, v4, LJ1/q;->s:Landroid/util/SparseArray;

    .line 350
    .line 351
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_5
    iget-object v6, v4, LJ1/q;->t:Landroid/os/Bundle;

    .line 355
    .line 356
    if-eqz v6, :cond_6

    .line 357
    .line 358
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    const-string v6, "mSavedViewRegistryState="

    .line 362
    .line 363
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 364
    .line 365
    .line 366
    iget-object v6, v4, LJ1/q;->t:Landroid/os/Bundle;

    .line 367
    .line 368
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    :cond_6
    iget-object v6, v4, LJ1/q;->w:LJ1/q;

    .line 372
    .line 373
    const/4 v7, 0x0

    .line 374
    if-eqz v6, :cond_7

    .line 375
    .line 376
    goto :goto_1

    .line 377
    :cond_7
    iget-object v6, v4, LJ1/q;->H:LJ1/H;

    .line 378
    .line 379
    if-eqz v6, :cond_8

    .line 380
    .line 381
    iget-object v8, v4, LJ1/q;->x:Ljava/lang/String;

    .line 382
    .line 383
    if-eqz v8, :cond_8

    .line 384
    .line 385
    iget-object v6, v6, LJ1/H;->c:LE/c0;

    .line 386
    .line 387
    invoke-virtual {v6, v8}, LE/c0;->f(Ljava/lang/String;)LJ1/q;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    goto :goto_1

    .line 392
    :cond_8
    move-object v6, v7

    .line 393
    :goto_1
    if-eqz v6, :cond_9

    .line 394
    .line 395
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    const-string v8, "mTarget="

    .line 399
    .line 400
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    const-string v6, " mTargetRequestCode="

    .line 407
    .line 408
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    iget v6, v4, LJ1/q;->y:I

    .line 412
    .line 413
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 414
    .line 415
    .line 416
    :cond_9
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    const-string v6, "mPopDirection="

    .line 420
    .line 421
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 425
    .line 426
    if-nez v6, :cond_a

    .line 427
    .line 428
    move v6, v5

    .line 429
    goto :goto_2

    .line 430
    :cond_a
    iget-boolean v6, v6, LJ1/p;->a:Z

    .line 431
    .line 432
    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    .line 433
    .line 434
    .line 435
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 436
    .line 437
    if-nez v6, :cond_b

    .line 438
    .line 439
    move v6, v5

    .line 440
    goto :goto_3

    .line 441
    :cond_b
    iget v6, v6, LJ1/p;->b:I

    .line 442
    .line 443
    :goto_3
    if-eqz v6, :cond_d

    .line 444
    .line 445
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    const-string v6, "getEnterAnim="

    .line 449
    .line 450
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 451
    .line 452
    .line 453
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 454
    .line 455
    if-nez v6, :cond_c

    .line 456
    .line 457
    move v6, v5

    .line 458
    goto :goto_4

    .line 459
    :cond_c
    iget v6, v6, LJ1/p;->b:I

    .line 460
    .line 461
    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 462
    .line 463
    .line 464
    :cond_d
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 465
    .line 466
    if-nez v6, :cond_e

    .line 467
    .line 468
    move v6, v5

    .line 469
    goto :goto_5

    .line 470
    :cond_e
    iget v6, v6, LJ1/p;->c:I

    .line 471
    .line 472
    :goto_5
    if-eqz v6, :cond_10

    .line 473
    .line 474
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    const-string v6, "getExitAnim="

    .line 478
    .line 479
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 483
    .line 484
    if-nez v6, :cond_f

    .line 485
    .line 486
    move v6, v5

    .line 487
    goto :goto_6

    .line 488
    :cond_f
    iget v6, v6, LJ1/p;->c:I

    .line 489
    .line 490
    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 491
    .line 492
    .line 493
    :cond_10
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 494
    .line 495
    if-nez v6, :cond_11

    .line 496
    .line 497
    move v6, v5

    .line 498
    goto :goto_7

    .line 499
    :cond_11
    iget v6, v6, LJ1/p;->d:I

    .line 500
    .line 501
    :goto_7
    if-eqz v6, :cond_13

    .line 502
    .line 503
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 504
    .line 505
    .line 506
    const-string v6, "getPopEnterAnim="

    .line 507
    .line 508
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 509
    .line 510
    .line 511
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 512
    .line 513
    if-nez v6, :cond_12

    .line 514
    .line 515
    move v6, v5

    .line 516
    goto :goto_8

    .line 517
    :cond_12
    iget v6, v6, LJ1/p;->d:I

    .line 518
    .line 519
    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 520
    .line 521
    .line 522
    :cond_13
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 523
    .line 524
    if-nez v6, :cond_14

    .line 525
    .line 526
    move v6, v5

    .line 527
    goto :goto_9

    .line 528
    :cond_14
    iget v6, v6, LJ1/p;->e:I

    .line 529
    .line 530
    :goto_9
    if-eqz v6, :cond_16

    .line 531
    .line 532
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 533
    .line 534
    .line 535
    const-string v6, "getPopExitAnim="

    .line 536
    .line 537
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 538
    .line 539
    .line 540
    iget-object v6, v4, LJ1/q;->X:LJ1/p;

    .line 541
    .line 542
    if-nez v6, :cond_15

    .line 543
    .line 544
    move v6, v5

    .line 545
    goto :goto_a

    .line 546
    :cond_15
    iget v6, v6, LJ1/p;->e:I

    .line 547
    .line 548
    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    .line 549
    .line 550
    .line 551
    :cond_16
    iget-object v6, v4, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 552
    .line 553
    if-eqz v6, :cond_17

    .line 554
    .line 555
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    const-string v6, "mContainer="

    .line 559
    .line 560
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    iget-object v6, v4, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 564
    .line 565
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    :cond_17
    iget-object v6, v4, LJ1/q;->U:Landroid/view/View;

    .line 569
    .line 570
    if-eqz v6, :cond_18

    .line 571
    .line 572
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    const-string v6, "mView="

    .line 576
    .line 577
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    iget-object v6, v4, LJ1/q;->U:Landroid/view/View;

    .line 581
    .line 582
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 583
    .line 584
    .line 585
    :cond_18
    invoke-virtual {v4}, LJ1/q;->i()Landroid/content/Context;

    .line 586
    .line 587
    .line 588
    move-result-object v6

    .line 589
    if-eqz v6, :cond_1c

    .line 590
    .line 591
    invoke-interface {v4}, Landroidx/lifecycle/l0;->f()Landroidx/lifecycle/k0;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    sget-object v8, LS1/a;->c:LJ1/J;

    .line 596
    .line 597
    const-string v9, "store"

    .line 598
    .line 599
    invoke-static {v6, v9}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    sget-object v9, LP1/a;->b:LP1/a;

    .line 603
    .line 604
    const-string v10, "defaultCreationExtras"

    .line 605
    .line 606
    invoke-static {v9, v10}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    new-instance v10, LE/c0;

    .line 610
    .line 611
    invoke-direct {v10, v6, v8, v9}, LE/c0;-><init>(Landroidx/lifecycle/k0;Landroidx/lifecycle/h0;LP1/c;)V

    .line 612
    .line 613
    .line 614
    const-class v6, LS1/a;

    .line 615
    .line 616
    invoke-static {v6}, Lkotlin/jvm/internal/z;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/f;

    .line 617
    .line 618
    .line 619
    move-result-object v6

    .line 620
    invoke-virtual {v6}, Lkotlin/jvm/internal/f;->b()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v8

    .line 624
    if-eqz v8, :cond_1b

    .line 625
    .line 626
    const-string v9, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 627
    .line 628
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v8

    .line 632
    invoke-virtual {v10, v8, v6}, LE/c0;->v(Ljava/lang/String;Lkotlin/jvm/internal/f;)Landroidx/lifecycle/f0;

    .line 633
    .line 634
    .line 635
    move-result-object v6

    .line 636
    check-cast v6, LS1/a;

    .line 637
    .line 638
    iget-object v6, v6, LS1/a;->b:Lr/S;

    .line 639
    .line 640
    invoke-virtual {v6}, Lr/S;->f()I

    .line 641
    .line 642
    .line 643
    move-result v8

    .line 644
    if-lez v8, :cond_1c

    .line 645
    .line 646
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    const-string v8, "Loaders:"

    .line 650
    .line 651
    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v6}, Lr/S;->f()I

    .line 655
    .line 656
    .line 657
    move-result v8

    .line 658
    if-gtz v8, :cond_19

    .line 659
    .line 660
    goto :goto_b

    .line 661
    :cond_19
    invoke-virtual {v6, v5}, Lr/S;->g(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object p1

    .line 665
    if-nez p1, :cond_1a

    .line 666
    .line 667
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    const-string p1, "  #"

    .line 671
    .line 672
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v6, v5}, Lr/S;->d(I)I

    .line 676
    .line 677
    .line 678
    move-result p1

    .line 679
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    .line 680
    .line 681
    .line 682
    const-string p1, ": "

    .line 683
    .line 684
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 685
    .line 686
    .line 687
    throw v7

    .line 688
    :cond_1a
    new-instance p1, Ljava/lang/ClassCastException;

    .line 689
    .line 690
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 691
    .line 692
    .line 693
    throw p1

    .line 694
    :cond_1b
    const-string p1, "Local and anonymous classes can not be ViewModels"

    .line 695
    .line 696
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 697
    .line 698
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    throw p2

    .line 702
    :cond_1c
    :goto_b
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    new-instance v5, Ljava/lang/StringBuilder;

    .line 706
    .line 707
    const-string v6, "Child "

    .line 708
    .line 709
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    iget-object v6, v4, LJ1/q;->J:LJ1/H;

    .line 713
    .line 714
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 715
    .line 716
    .line 717
    const-string v6, ":"

    .line 718
    .line 719
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 720
    .line 721
    .line 722
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 723
    .line 724
    .line 725
    move-result-object v5

    .line 726
    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 727
    .line 728
    .line 729
    iget-object v4, v4, LJ1/q;->J:LJ1/H;

    .line 730
    .line 731
    const-string v5, "  "

    .line 732
    .line 733
    invoke-static {v3, v5}, LC0/S;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 734
    .line 735
    .line 736
    move-result-object v5

    .line 737
    invoke-virtual {v4, v5, p2, p3, p4}, LJ1/H;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 738
    .line 739
    .line 740
    goto/16 :goto_0

    .line 741
    .line 742
    :cond_1d
    const-string v4, "null"

    .line 743
    .line 744
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    goto/16 :goto_0

    .line 748
    .line 749
    :cond_1e
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 750
    .line 751
    .line 752
    move-result p2

    .line 753
    const/4 p4, 0x0

    .line 754
    if-lez p2, :cond_1f

    .line 755
    .line 756
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 757
    .line 758
    .line 759
    const-string v1, "Added Fragments:"

    .line 760
    .line 761
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    move v1, p4

    .line 765
    :goto_c
    if-ge v1, p2, :cond_1f

    .line 766
    .line 767
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    check-cast v3, LJ1/q;

    .line 772
    .line 773
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    const-string v4, "  #"

    .line 777
    .line 778
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 779
    .line 780
    .line 781
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 782
    .line 783
    .line 784
    const-string v4, ": "

    .line 785
    .line 786
    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    invoke-virtual {v3}, LJ1/q;->toString()Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    add-int/lit8 v1, v1, 0x1

    .line 797
    .line 798
    goto :goto_c

    .line 799
    :cond_1f
    iget-object p2, p0, LJ1/H;->e:Ljava/util/ArrayList;

    .line 800
    .line 801
    if-eqz p2, :cond_20

    .line 802
    .line 803
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 804
    .line 805
    .line 806
    move-result p2

    .line 807
    if-lez p2, :cond_20

    .line 808
    .line 809
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    const-string v1, "Fragments Created Menus:"

    .line 813
    .line 814
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 815
    .line 816
    .line 817
    move v1, p4

    .line 818
    :goto_d
    if-ge v1, p2, :cond_20

    .line 819
    .line 820
    iget-object v2, p0, LJ1/H;->e:Ljava/util/ArrayList;

    .line 821
    .line 822
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 823
    .line 824
    .line 825
    move-result-object v2

    .line 826
    check-cast v2, LJ1/q;

    .line 827
    .line 828
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    const-string v3, "  #"

    .line 832
    .line 833
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 837
    .line 838
    .line 839
    const-string v3, ": "

    .line 840
    .line 841
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v2}, LJ1/q;->toString()Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v2

    .line 848
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    add-int/lit8 v1, v1, 0x1

    .line 852
    .line 853
    goto :goto_d

    .line 854
    :cond_20
    iget-object p2, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 855
    .line 856
    if-eqz p2, :cond_21

    .line 857
    .line 858
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 859
    .line 860
    .line 861
    move-result p2

    .line 862
    if-lez p2, :cond_21

    .line 863
    .line 864
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    const-string v1, "Back Stack:"

    .line 868
    .line 869
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    move v1, p4

    .line 873
    :goto_e
    if-ge v1, p2, :cond_21

    .line 874
    .line 875
    iget-object v2, p0, LJ1/H;->d:Ljava/util/ArrayList;

    .line 876
    .line 877
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v2

    .line 881
    check-cast v2, LJ1/a;

    .line 882
    .line 883
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 884
    .line 885
    .line 886
    const-string v3, "  #"

    .line 887
    .line 888
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    .line 892
    .line 893
    .line 894
    const-string v3, ": "

    .line 895
    .line 896
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v2}, LJ1/a;->toString()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v3

    .line 903
    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 904
    .line 905
    .line 906
    const/4 v3, 0x1

    .line 907
    invoke-virtual {v2, v0, p3, v3}, LJ1/a;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    .line 908
    .line 909
    .line 910
    add-int/lit8 v1, v1, 0x1

    .line 911
    .line 912
    goto :goto_e

    .line 913
    :cond_21
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 914
    .line 915
    .line 916
    new-instance p2, Ljava/lang/StringBuilder;

    .line 917
    .line 918
    const-string v0, "Back Stack Index: "

    .line 919
    .line 920
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    iget-object v0, p0, LJ1/H;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 924
    .line 925
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 926
    .line 927
    .line 928
    move-result v0

    .line 929
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 930
    .line 931
    .line 932
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object p2

    .line 936
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    iget-object p2, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 940
    .line 941
    monitor-enter p2

    .line 942
    :try_start_0
    iget-object v0, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 943
    .line 944
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 945
    .line 946
    .line 947
    move-result v0

    .line 948
    if-lez v0, :cond_22

    .line 949
    .line 950
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 951
    .line 952
    .line 953
    const-string v1, "Pending Actions:"

    .line 954
    .line 955
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    :goto_f
    if-ge p4, v0, :cond_22

    .line 959
    .line 960
    iget-object v1, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 961
    .line 962
    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 963
    .line 964
    .line 965
    move-result-object v1

    .line 966
    check-cast v1, LJ1/F;

    .line 967
    .line 968
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    const-string v2, "  #"

    .line 972
    .line 973
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    .line 977
    .line 978
    .line 979
    const-string v2, ": "

    .line 980
    .line 981
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 982
    .line 983
    .line 984
    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 985
    .line 986
    .line 987
    add-int/lit8 p4, p4, 0x1

    .line 988
    .line 989
    goto :goto_f

    .line 990
    :catchall_0
    move-exception p1

    .line 991
    goto :goto_10

    .line 992
    :cond_22
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 993
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 994
    .line 995
    .line 996
    const-string p2, "FragmentManager misc state:"

    .line 997
    .line 998
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1002
    .line 1003
    .line 1004
    const-string p2, "  mHost="

    .line 1005
    .line 1006
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1007
    .line 1008
    .line 1009
    iget-object p2, p0, LJ1/H;->t:LJ1/u;

    .line 1010
    .line 1011
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    const-string p2, "  mContainer="

    .line 1018
    .line 1019
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1020
    .line 1021
    .line 1022
    iget-object p2, p0, LJ1/H;->u:LC3/a;

    .line 1023
    .line 1024
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1025
    .line 1026
    .line 1027
    iget-object p2, p0, LJ1/H;->v:LJ1/q;

    .line 1028
    .line 1029
    if-eqz p2, :cond_23

    .line 1030
    .line 1031
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1032
    .line 1033
    .line 1034
    const-string p2, "  mParent="

    .line 1035
    .line 1036
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    iget-object p2, p0, LJ1/H;->v:LJ1/q;

    .line 1040
    .line 1041
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    .line 1042
    .line 1043
    .line 1044
    :cond_23
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1045
    .line 1046
    .line 1047
    const-string p2, "  mCurState="

    .line 1048
    .line 1049
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1050
    .line 1051
    .line 1052
    iget p2, p0, LJ1/H;->s:I

    .line 1053
    .line 1054
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    .line 1055
    .line 1056
    .line 1057
    const-string p2, " mStateSaved="

    .line 1058
    .line 1059
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1060
    .line 1061
    .line 1062
    iget-boolean p2, p0, LJ1/H;->E:Z

    .line 1063
    .line 1064
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1065
    .line 1066
    .line 1067
    const-string p2, " mStopped="

    .line 1068
    .line 1069
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    iget-boolean p2, p0, LJ1/H;->F:Z

    .line 1073
    .line 1074
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    .line 1075
    .line 1076
    .line 1077
    const-string p2, " mDestroyed="

    .line 1078
    .line 1079
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1080
    .line 1081
    .line 1082
    iget-boolean p2, p0, LJ1/H;->G:Z

    .line 1083
    .line 1084
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 1085
    .line 1086
    .line 1087
    iget-boolean p2, p0, LJ1/H;->D:Z

    .line 1088
    .line 1089
    if-eqz p2, :cond_24

    .line 1090
    .line 1091
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1092
    .line 1093
    .line 1094
    const-string p1, "  mNeedMenuInvalidate="

    .line 1095
    .line 1096
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 1097
    .line 1098
    .line 1099
    iget-boolean p1, p0, LJ1/H;->D:Z

    .line 1100
    .line 1101
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    .line 1102
    .line 1103
    .line 1104
    :cond_24
    return-void

    .line 1105
    :goto_10
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1106
    throw p1
.end method

.method public final w(LJ1/F;Z)V
    .locals 2

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-boolean p1, p0, LJ1/H;->G:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string p2, "FragmentManager has been destroyed"

    .line 14
    .line 15
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string p2, "FragmentManager has not been attached to a host."

    .line 22
    .line 23
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-boolean v0, p0, LJ1/H;->E:Z

    .line 28
    .line 29
    if-nez v0, :cond_2

    .line 30
    .line 31
    iget-boolean v0, p0, LJ1/H;->F:Z

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 37
    .line 38
    const-string p2, "Can not perform this action after onSaveInstanceState"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1

    .line 44
    :cond_3
    :goto_0
    iget-object v0, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 45
    .line 46
    monitor-enter v0

    .line 47
    :try_start_0
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    if-eqz p2, :cond_4

    .line 52
    .line 53
    monitor-exit v0

    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 58
    .line 59
    const-string p2, "Activity has been destroyed"

    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_5
    iget-object p2, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, LJ1/H;->T()V

    .line 71
    .line 72
    .line 73
    monitor-exit v0

    .line 74
    return-void

    .line 75
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    throw p1
.end method

.method public final x(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LJ1/H;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, p0, LJ1/H;->G:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "FragmentManager has been destroyed"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v0, "FragmentManager has not been attached to a host."

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1

    .line 29
    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 34
    .line 35
    iget-object v1, v1, LJ1/u;->v:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-ne v0, v1, :cond_5

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    iget-boolean p1, p0, LJ1/H;->E:Z

    .line 46
    .line 47
    if-nez p1, :cond_2

    .line 48
    .line 49
    iget-boolean p1, p0, LJ1/H;->F:Z

    .line 50
    .line 51
    if-nez p1, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 55
    .line 56
    const-string v0, "Can not perform this action after onSaveInstanceState"

    .line 57
    .line 58
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :cond_3
    :goto_0
    iget-object p1, p0, LJ1/H;->I:Ljava/util/ArrayList;

    .line 63
    .line 64
    if-nez p1, :cond_4

    .line 65
    .line 66
    new-instance p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, LJ1/H;->I:Ljava/util/ArrayList;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, LJ1/H;->J:Ljava/util/ArrayList;

    .line 79
    .line 80
    :cond_4
    return-void

    .line 81
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string v0, "Must be called from main thread of fragment host"

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v0, "FragmentManager is already executing transactions"

    .line 92
    .line 93
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1
.end method

.method public final y(Z)Z
    .locals 8

    .line 1
    invoke-virtual {p0, p1}, LJ1/H;->x(Z)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    move v0, p1

    .line 6
    :goto_0
    iget-object v1, p0, LJ1/H;->I:Ljava/util/ArrayList;

    .line 7
    .line 8
    iget-object v2, p0, LJ1/H;->J:Ljava/util/ArrayList;

    .line 9
    .line 10
    iget-object v3, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 11
    .line 12
    monitor-enter v3

    .line 13
    :try_start_0
    iget-object v4, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    move v6, p1

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_4

    .line 26
    :cond_0
    :try_start_1
    iget-object v4, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    move v5, p1

    .line 33
    move v6, v5

    .line 34
    :goto_1
    if-ge v5, v4, :cond_1

    .line 35
    .line 36
    iget-object v7, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, LJ1/F;

    .line 43
    .line 44
    invoke-interface {v7, v1, v2}, LJ1/F;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    .line 45
    .line 46
    .line 47
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    or-int/2addr v6, v7

    .line 49
    add-int/lit8 v5, v5, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_1
    move-exception p1

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    :try_start_2
    iget-object v1, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, LJ1/H;->t:LJ1/u;

    .line 60
    .line 61
    iget-object v1, v1, LJ1/u;->v:Landroid/os/Handler;

    .line 62
    .line 63
    iget-object v2, p0, LJ1/H;->M:LA1/b;

    .line 64
    .line 65
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    :goto_2
    if-eqz v6, :cond_2

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    iput-boolean v0, p0, LJ1/H;->b:Z

    .line 73
    .line 74
    :try_start_3
    iget-object v1, p0, LJ1/H;->I:Ljava/util/ArrayList;

    .line 75
    .line 76
    iget-object v2, p0, LJ1/H;->J:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p0, v1, v2}, LJ1/H;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, LJ1/H;->d()V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :catchall_2
    move-exception p1

    .line 86
    invoke-virtual {p0}, LJ1/H;->d()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :cond_2
    invoke-virtual {p0}, LJ1/H;->b0()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, LJ1/H;->u()V

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, LJ1/H;->c:LE/c0;

    .line 97
    .line 98
    iget-object p1, p1, LE/c0;->r:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const/4 v1, 0x0

    .line 107
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    .line 112
    .line 113
    .line 114
    return v0

    .line 115
    :goto_3
    :try_start_4
    iget-object v0, p0, LJ1/H;->a:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, LJ1/H;->t:LJ1/u;

    .line 121
    .line 122
    iget-object v0, v0, LJ1/u;->v:Landroid/os/Handler;

    .line 123
    .line 124
    iget-object v1, p0, LJ1/H;->M:LA1/b;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    throw p1

    .line 130
    :goto_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 131
    throw p1
.end method

.method public final z(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    iget-object v4, v1, LJ1/H;->c:LE/c0;

    .line 10
    .line 11
    move/from16 v5, p3

    .line 12
    .line 13
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    check-cast v6, LJ1/a;

    .line 18
    .line 19
    iget-boolean v6, v6, LJ1/a;->o:Z

    .line 20
    .line 21
    iget-object v7, v1, LJ1/H;->K:Ljava/util/ArrayList;

    .line 22
    .line 23
    if-nez v7, :cond_0

    .line 24
    .line 25
    new-instance v7, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v7, v1, LJ1/H;->K:Ljava/util/ArrayList;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v7}, Ljava/util/ArrayList;->clear()V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object v7, v1, LJ1/H;->K:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v4}, LE/c0;->s()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 43
    .line 44
    .line 45
    iget-object v7, v1, LJ1/H;->w:LJ1/q;

    .line 46
    .line 47
    move v9, v5

    .line 48
    const/4 v10, 0x0

    .line 49
    :goto_1
    const/4 v12, 0x1

    .line 50
    if-ge v9, v3, :cond_13

    .line 51
    .line 52
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v13

    .line 56
    check-cast v13, LJ1/a;

    .line 57
    .line 58
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v14

    .line 62
    check-cast v14, Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result v14

    .line 68
    if-nez v14, :cond_d

    .line 69
    .line 70
    iget-object v14, v1, LJ1/H;->K:Ljava/util/ArrayList;

    .line 71
    .line 72
    iget-object v11, v13, LJ1/a;->a:Ljava/util/ArrayList;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    :goto_2
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v15

    .line 79
    if-ge v8, v15, :cond_c

    .line 80
    .line 81
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v15

    .line 85
    check-cast v15, LJ1/O;

    .line 86
    .line 87
    iget v5, v15, LJ1/O;->a:I

    .line 88
    .line 89
    if-eq v5, v12, :cond_b

    .line 90
    .line 91
    const/4 v12, 0x2

    .line 92
    move/from16 v17, v6

    .line 93
    .line 94
    const/16 v6, 0x9

    .line 95
    .line 96
    if-eq v5, v12, :cond_5

    .line 97
    .line 98
    const/4 v12, 0x3

    .line 99
    if-eq v5, v12, :cond_4

    .line 100
    .line 101
    const/4 v12, 0x6

    .line 102
    if-eq v5, v12, :cond_4

    .line 103
    .line 104
    const/4 v12, 0x7

    .line 105
    if-eq v5, v12, :cond_3

    .line 106
    .line 107
    const/16 v12, 0x8

    .line 108
    .line 109
    if-eq v5, v12, :cond_1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_1
    new-instance v5, LJ1/O;

    .line 113
    .line 114
    const/4 v12, 0x0

    .line 115
    invoke-direct {v5, v6, v7, v12}, LJ1/O;-><init>(ILJ1/q;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v11, v8, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    const/4 v5, 0x1

    .line 122
    iput-boolean v5, v15, LJ1/O;->c:Z

    .line 123
    .line 124
    add-int/lit8 v8, v8, 0x1

    .line 125
    .line 126
    iget-object v5, v15, LJ1/O;->b:LJ1/q;

    .line 127
    .line 128
    move-object v7, v5

    .line 129
    :cond_2
    :goto_3
    move/from16 v20, v9

    .line 130
    .line 131
    move/from16 v19, v10

    .line 132
    .line 133
    const/4 v6, 0x1

    .line 134
    goto/16 :goto_9

    .line 135
    .line 136
    :cond_3
    const/4 v6, 0x1

    .line 137
    :goto_4
    move/from16 v20, v9

    .line 138
    .line 139
    move/from16 v19, v10

    .line 140
    .line 141
    goto/16 :goto_8

    .line 142
    .line 143
    :cond_4
    iget-object v5, v15, LJ1/O;->b:LJ1/q;

    .line 144
    .line 145
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    iget-object v5, v15, LJ1/O;->b:LJ1/q;

    .line 149
    .line 150
    if-ne v5, v7, :cond_2

    .line 151
    .line 152
    new-instance v7, LJ1/O;

    .line 153
    .line 154
    invoke-direct {v7, v6, v5}, LJ1/O;-><init>(ILJ1/q;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v11, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    add-int/lit8 v8, v8, 0x1

    .line 161
    .line 162
    move/from16 v20, v9

    .line 163
    .line 164
    move/from16 v19, v10

    .line 165
    .line 166
    const/4 v6, 0x1

    .line 167
    const/4 v7, 0x0

    .line 168
    goto/16 :goto_9

    .line 169
    .line 170
    :cond_5
    iget-object v5, v15, LJ1/O;->b:LJ1/q;

    .line 171
    .line 172
    iget v12, v5, LJ1/q;->M:I

    .line 173
    .line 174
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 175
    .line 176
    .line 177
    move-result v18

    .line 178
    const/16 v16, 0x1

    .line 179
    .line 180
    add-int/lit8 v18, v18, -0x1

    .line 181
    .line 182
    move/from16 v6, v18

    .line 183
    .line 184
    const/16 v18, 0x0

    .line 185
    .line 186
    :goto_5
    if-ltz v6, :cond_9

    .line 187
    .line 188
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v20

    .line 192
    move/from16 v21, v6

    .line 193
    .line 194
    move-object/from16 v6, v20

    .line 195
    .line 196
    check-cast v6, LJ1/q;

    .line 197
    .line 198
    move/from16 v20, v9

    .line 199
    .line 200
    iget v9, v6, LJ1/q;->M:I

    .line 201
    .line 202
    if-ne v9, v12, :cond_8

    .line 203
    .line 204
    if-ne v6, v5, :cond_6

    .line 205
    .line 206
    move/from16 v19, v10

    .line 207
    .line 208
    const/4 v6, 0x1

    .line 209
    const/16 v18, 0x1

    .line 210
    .line 211
    goto :goto_7

    .line 212
    :cond_6
    if-ne v6, v7, :cond_7

    .line 213
    .line 214
    new-instance v7, LJ1/O;

    .line 215
    .line 216
    move/from16 v19, v10

    .line 217
    .line 218
    const/4 v9, 0x0

    .line 219
    const/16 v10, 0x9

    .line 220
    .line 221
    invoke-direct {v7, v10, v6, v9}, LJ1/O;-><init>(ILJ1/q;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v11, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    add-int/lit8 v8, v8, 0x1

    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    goto :goto_6

    .line 231
    :cond_7
    move/from16 v19, v10

    .line 232
    .line 233
    const/4 v9, 0x0

    .line 234
    const/16 v10, 0x9

    .line 235
    .line 236
    :goto_6
    new-instance v10, LJ1/O;

    .line 237
    .line 238
    move-object/from16 v22, v7

    .line 239
    .line 240
    const/4 v7, 0x3

    .line 241
    invoke-direct {v10, v7, v6, v9}, LJ1/O;-><init>(ILJ1/q;I)V

    .line 242
    .line 243
    .line 244
    iget v7, v15, LJ1/O;->d:I

    .line 245
    .line 246
    iput v7, v10, LJ1/O;->d:I

    .line 247
    .line 248
    iget v7, v15, LJ1/O;->f:I

    .line 249
    .line 250
    iput v7, v10, LJ1/O;->f:I

    .line 251
    .line 252
    iget v7, v15, LJ1/O;->e:I

    .line 253
    .line 254
    iput v7, v10, LJ1/O;->e:I

    .line 255
    .line 256
    iget v7, v15, LJ1/O;->g:I

    .line 257
    .line 258
    iput v7, v10, LJ1/O;->g:I

    .line 259
    .line 260
    invoke-virtual {v11, v8, v10}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    const/4 v6, 0x1

    .line 267
    add-int/2addr v8, v6

    .line 268
    move-object/from16 v7, v22

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_8
    move/from16 v19, v10

    .line 272
    .line 273
    const/4 v6, 0x1

    .line 274
    :goto_7
    add-int/lit8 v9, v21, -0x1

    .line 275
    .line 276
    move v6, v9

    .line 277
    move/from16 v10, v19

    .line 278
    .line 279
    move/from16 v9, v20

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_9
    move/from16 v20, v9

    .line 283
    .line 284
    move/from16 v19, v10

    .line 285
    .line 286
    const/4 v6, 0x1

    .line 287
    if-eqz v18, :cond_a

    .line 288
    .line 289
    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    add-int/lit8 v8, v8, -0x1

    .line 293
    .line 294
    goto :goto_9

    .line 295
    :cond_a
    iput v6, v15, LJ1/O;->a:I

    .line 296
    .line 297
    iput-boolean v6, v15, LJ1/O;->c:Z

    .line 298
    .line 299
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    goto :goto_9

    .line 303
    :cond_b
    move/from16 v17, v6

    .line 304
    .line 305
    move v6, v12

    .line 306
    goto/16 :goto_4

    .line 307
    .line 308
    :goto_8
    iget-object v5, v15, LJ1/O;->b:LJ1/q;

    .line 309
    .line 310
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    :goto_9
    add-int/2addr v8, v6

    .line 314
    move/from16 v5, p3

    .line 315
    .line 316
    move v12, v6

    .line 317
    move/from16 v6, v17

    .line 318
    .line 319
    move/from16 v10, v19

    .line 320
    .line 321
    move/from16 v9, v20

    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :cond_c
    move/from16 v17, v6

    .line 326
    .line 327
    move/from16 v20, v9

    .line 328
    .line 329
    move/from16 v19, v10

    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_d
    move/from16 v17, v6

    .line 333
    .line 334
    move/from16 v20, v9

    .line 335
    .line 336
    move/from16 v19, v10

    .line 337
    .line 338
    move v6, v12

    .line 339
    iget-object v5, v1, LJ1/H;->K:Ljava/util/ArrayList;

    .line 340
    .line 341
    iget-object v8, v13, LJ1/a;->a:Ljava/util/ArrayList;

    .line 342
    .line 343
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 344
    .line 345
    .line 346
    move-result v9

    .line 347
    sub-int/2addr v9, v6

    .line 348
    :goto_a
    if-ltz v9, :cond_10

    .line 349
    .line 350
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v10

    .line 354
    check-cast v10, LJ1/O;

    .line 355
    .line 356
    iget v11, v10, LJ1/O;->a:I

    .line 357
    .line 358
    const/4 v12, 0x3

    .line 359
    if-eq v11, v6, :cond_f

    .line 360
    .line 361
    if-eq v11, v12, :cond_e

    .line 362
    .line 363
    packed-switch v11, :pswitch_data_0

    .line 364
    .line 365
    .line 366
    goto :goto_b

    .line 367
    :pswitch_0
    iget-object v6, v10, LJ1/O;->h:Landroidx/lifecycle/p;

    .line 368
    .line 369
    iput-object v6, v10, LJ1/O;->i:Landroidx/lifecycle/p;

    .line 370
    .line 371
    goto :goto_b

    .line 372
    :pswitch_1
    iget-object v6, v10, LJ1/O;->b:LJ1/q;

    .line 373
    .line 374
    move-object v7, v6

    .line 375
    goto :goto_b

    .line 376
    :pswitch_2
    const/4 v7, 0x0

    .line 377
    goto :goto_b

    .line 378
    :cond_e
    :pswitch_3
    iget-object v6, v10, LJ1/O;->b:LJ1/q;

    .line 379
    .line 380
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    goto :goto_b

    .line 384
    :cond_f
    :pswitch_4
    iget-object v6, v10, LJ1/O;->b:LJ1/q;

    .line 385
    .line 386
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    :goto_b
    add-int/lit8 v9, v9, -0x1

    .line 390
    .line 391
    const/4 v6, 0x1

    .line 392
    goto :goto_a

    .line 393
    :cond_10
    :goto_c
    if-nez v19, :cond_12

    .line 394
    .line 395
    iget-boolean v5, v13, LJ1/a;->g:Z

    .line 396
    .line 397
    if-eqz v5, :cond_11

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :cond_11
    const/4 v10, 0x0

    .line 401
    goto :goto_e

    .line 402
    :cond_12
    :goto_d
    const/4 v10, 0x1

    .line 403
    :goto_e
    add-int/lit8 v9, v20, 0x1

    .line 404
    .line 405
    move/from16 v5, p3

    .line 406
    .line 407
    move/from16 v6, v17

    .line 408
    .line 409
    goto/16 :goto_1

    .line 410
    .line 411
    :cond_13
    move/from16 v17, v6

    .line 412
    .line 413
    iget-object v5, v1, LJ1/H;->K:Ljava/util/ArrayList;

    .line 414
    .line 415
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 416
    .line 417
    .line 418
    if-nez v17, :cond_16

    .line 419
    .line 420
    iget v5, v1, LJ1/H;->s:I

    .line 421
    .line 422
    const/4 v6, 0x1

    .line 423
    if-lt v5, v6, :cond_16

    .line 424
    .line 425
    move/from16 v5, p3

    .line 426
    .line 427
    :goto_f
    if-ge v5, v3, :cond_16

    .line 428
    .line 429
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v6

    .line 433
    check-cast v6, LJ1/a;

    .line 434
    .line 435
    iget-object v6, v6, LJ1/a;->a:Ljava/util/ArrayList;

    .line 436
    .line 437
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 438
    .line 439
    .line 440
    move-result v7

    .line 441
    const/4 v8, 0x0

    .line 442
    :cond_14
    :goto_10
    if-ge v8, v7, :cond_15

    .line 443
    .line 444
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v9

    .line 448
    add-int/lit8 v8, v8, 0x1

    .line 449
    .line 450
    check-cast v9, LJ1/O;

    .line 451
    .line 452
    iget-object v9, v9, LJ1/O;->b:LJ1/q;

    .line 453
    .line 454
    if-eqz v9, :cond_14

    .line 455
    .line 456
    iget-object v10, v9, LJ1/q;->H:LJ1/H;

    .line 457
    .line 458
    if-eqz v10, :cond_14

    .line 459
    .line 460
    invoke-virtual {v1, v9}, LJ1/H;->f(LJ1/q;)LJ1/N;

    .line 461
    .line 462
    .line 463
    move-result-object v9

    .line 464
    invoke-virtual {v4, v9}, LE/c0;->w(LJ1/N;)V

    .line 465
    .line 466
    .line 467
    goto :goto_10

    .line 468
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 469
    .line 470
    goto :goto_f

    .line 471
    :cond_16
    const-string v4, "Unknown cmd: "

    .line 472
    .line 473
    move/from16 v5, p3

    .line 474
    .line 475
    :goto_11
    const/4 v6, -0x1

    .line 476
    if-ge v5, v3, :cond_22

    .line 477
    .line 478
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v7

    .line 482
    check-cast v7, LJ1/a;

    .line 483
    .line 484
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    check-cast v8, Ljava/lang/Boolean;

    .line 489
    .line 490
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 491
    .line 492
    .line 493
    move-result v8

    .line 494
    if-eqz v8, :cond_1e

    .line 495
    .line 496
    invoke-virtual {v7, v6}, LJ1/a;->c(I)V

    .line 497
    .line 498
    .line 499
    iget-object v6, v7, LJ1/a;->p:LJ1/H;

    .line 500
    .line 501
    iget-object v8, v7, LJ1/a;->a:Ljava/util/ArrayList;

    .line 502
    .line 503
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 504
    .line 505
    .line 506
    move-result v9

    .line 507
    const/4 v10, 0x1

    .line 508
    sub-int/2addr v9, v10

    .line 509
    :goto_12
    if-ltz v9, :cond_1d

    .line 510
    .line 511
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v11

    .line 515
    check-cast v11, LJ1/O;

    .line 516
    .line 517
    iget-object v12, v11, LJ1/O;->b:LJ1/q;

    .line 518
    .line 519
    if-eqz v12, :cond_1c

    .line 520
    .line 521
    iget-object v13, v12, LJ1/q;->X:LJ1/p;

    .line 522
    .line 523
    if-nez v13, :cond_17

    .line 524
    .line 525
    goto :goto_13

    .line 526
    :cond_17
    invoke-virtual {v12}, LJ1/q;->g()LJ1/p;

    .line 527
    .line 528
    .line 529
    move-result-object v13

    .line 530
    iput-boolean v10, v13, LJ1/p;->a:Z

    .line 531
    .line 532
    :goto_13
    iget v10, v7, LJ1/a;->f:I

    .line 533
    .line 534
    const/16 v13, 0x2002

    .line 535
    .line 536
    const/16 v14, 0x1001

    .line 537
    .line 538
    if-eq v10, v14, :cond_1a

    .line 539
    .line 540
    if-eq v10, v13, :cond_18

    .line 541
    .line 542
    const/16 v13, 0x1004

    .line 543
    .line 544
    const/16 v14, 0x2005

    .line 545
    .line 546
    if-eq v10, v14, :cond_1a

    .line 547
    .line 548
    const/16 v15, 0x1003

    .line 549
    .line 550
    if-eq v10, v15, :cond_19

    .line 551
    .line 552
    if-eq v10, v13, :cond_18

    .line 553
    .line 554
    const/4 v13, 0x0

    .line 555
    goto :goto_14

    .line 556
    :cond_18
    move v13, v14

    .line 557
    goto :goto_14

    .line 558
    :cond_19
    move v13, v15

    .line 559
    :cond_1a
    :goto_14
    iget-object v10, v12, LJ1/q;->X:LJ1/p;

    .line 560
    .line 561
    if-nez v10, :cond_1b

    .line 562
    .line 563
    if-nez v13, :cond_1b

    .line 564
    .line 565
    goto :goto_15

    .line 566
    :cond_1b
    invoke-virtual {v12}, LJ1/q;->g()LJ1/p;

    .line 567
    .line 568
    .line 569
    iget-object v10, v12, LJ1/q;->X:LJ1/p;

    .line 570
    .line 571
    iput v13, v10, LJ1/p;->f:I

    .line 572
    .line 573
    :goto_15
    invoke-virtual {v12}, LJ1/q;->g()LJ1/p;

    .line 574
    .line 575
    .line 576
    iget-object v10, v12, LJ1/q;->X:LJ1/p;

    .line 577
    .line 578
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    :cond_1c
    iget v10, v11, LJ1/O;->a:I

    .line 582
    .line 583
    packed-switch v10, :pswitch_data_1

    .line 584
    .line 585
    .line 586
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 587
    .line 588
    new-instance v2, Ljava/lang/StringBuilder;

    .line 589
    .line 590
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    iget v3, v11, LJ1/O;->a:I

    .line 594
    .line 595
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 596
    .line 597
    .line 598
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 599
    .line 600
    .line 601
    move-result-object v2

    .line 602
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 603
    .line 604
    .line 605
    throw v0

    .line 606
    :pswitch_6
    iget-object v10, v11, LJ1/O;->h:Landroidx/lifecycle/p;

    .line 607
    .line 608
    invoke-virtual {v6, v12, v10}, LJ1/H;->V(LJ1/q;Landroidx/lifecycle/p;)V

    .line 609
    .line 610
    .line 611
    :goto_16
    const/4 v10, 0x1

    .line 612
    goto/16 :goto_17

    .line 613
    .line 614
    :pswitch_7
    invoke-virtual {v6, v12}, LJ1/H;->W(LJ1/q;)V

    .line 615
    .line 616
    .line 617
    goto :goto_16

    .line 618
    :pswitch_8
    const/4 v10, 0x0

    .line 619
    invoke-virtual {v6, v10}, LJ1/H;->W(LJ1/q;)V

    .line 620
    .line 621
    .line 622
    goto :goto_16

    .line 623
    :pswitch_9
    iget v10, v11, LJ1/O;->d:I

    .line 624
    .line 625
    iget v13, v11, LJ1/O;->e:I

    .line 626
    .line 627
    iget v14, v11, LJ1/O;->f:I

    .line 628
    .line 629
    iget v11, v11, LJ1/O;->g:I

    .line 630
    .line 631
    invoke-virtual {v12, v10, v13, v14, v11}, LJ1/q;->E(IIII)V

    .line 632
    .line 633
    .line 634
    const/4 v10, 0x1

    .line 635
    invoke-virtual {v6, v12, v10}, LJ1/H;->U(LJ1/q;Z)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v6, v12}, LJ1/H;->g(LJ1/q;)V

    .line 639
    .line 640
    .line 641
    goto :goto_16

    .line 642
    :pswitch_a
    iget v10, v11, LJ1/O;->d:I

    .line 643
    .line 644
    iget v13, v11, LJ1/O;->e:I

    .line 645
    .line 646
    iget v14, v11, LJ1/O;->f:I

    .line 647
    .line 648
    iget v11, v11, LJ1/O;->g:I

    .line 649
    .line 650
    invoke-virtual {v12, v10, v13, v14, v11}, LJ1/q;->E(IIII)V

    .line 651
    .line 652
    .line 653
    invoke-virtual {v6, v12}, LJ1/H;->c(LJ1/q;)V

    .line 654
    .line 655
    .line 656
    goto :goto_16

    .line 657
    :pswitch_b
    iget v10, v11, LJ1/O;->d:I

    .line 658
    .line 659
    iget v13, v11, LJ1/O;->e:I

    .line 660
    .line 661
    iget v14, v11, LJ1/O;->f:I

    .line 662
    .line 663
    iget v11, v11, LJ1/O;->g:I

    .line 664
    .line 665
    invoke-virtual {v12, v10, v13, v14, v11}, LJ1/q;->E(IIII)V

    .line 666
    .line 667
    .line 668
    const/4 v10, 0x1

    .line 669
    invoke-virtual {v6, v12, v10}, LJ1/H;->U(LJ1/q;Z)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v6, v12}, LJ1/H;->E(LJ1/q;)V

    .line 673
    .line 674
    .line 675
    goto :goto_16

    .line 676
    :pswitch_c
    iget v10, v11, LJ1/O;->d:I

    .line 677
    .line 678
    iget v13, v11, LJ1/O;->e:I

    .line 679
    .line 680
    iget v14, v11, LJ1/O;->f:I

    .line 681
    .line 682
    iget v11, v11, LJ1/O;->g:I

    .line 683
    .line 684
    invoke-virtual {v12, v10, v13, v14, v11}, LJ1/q;->E(IIII)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    invoke-static {v12}, LJ1/H;->Y(LJ1/q;)V

    .line 691
    .line 692
    .line 693
    goto :goto_16

    .line 694
    :pswitch_d
    iget v10, v11, LJ1/O;->d:I

    .line 695
    .line 696
    iget v13, v11, LJ1/O;->e:I

    .line 697
    .line 698
    iget v14, v11, LJ1/O;->f:I

    .line 699
    .line 700
    iget v11, v11, LJ1/O;->g:I

    .line 701
    .line 702
    invoke-virtual {v12, v10, v13, v14, v11}, LJ1/q;->E(IIII)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v6, v12}, LJ1/H;->a(LJ1/q;)LJ1/N;

    .line 706
    .line 707
    .line 708
    goto :goto_16

    .line 709
    :pswitch_e
    iget v10, v11, LJ1/O;->d:I

    .line 710
    .line 711
    iget v13, v11, LJ1/O;->e:I

    .line 712
    .line 713
    iget v14, v11, LJ1/O;->f:I

    .line 714
    .line 715
    iget v11, v11, LJ1/O;->g:I

    .line 716
    .line 717
    invoke-virtual {v12, v10, v13, v14, v11}, LJ1/q;->E(IIII)V

    .line 718
    .line 719
    .line 720
    const/4 v10, 0x1

    .line 721
    invoke-virtual {v6, v12, v10}, LJ1/H;->U(LJ1/q;Z)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v6, v12}, LJ1/H;->P(LJ1/q;)V

    .line 725
    .line 726
    .line 727
    :goto_17
    add-int/lit8 v9, v9, -0x1

    .line 728
    .line 729
    goto/16 :goto_12

    .line 730
    .line 731
    :cond_1d
    const/4 v14, 0x0

    .line 732
    goto/16 :goto_1d

    .line 733
    .line 734
    :cond_1e
    const/4 v10, 0x1

    .line 735
    invoke-virtual {v7, v10}, LJ1/a;->c(I)V

    .line 736
    .line 737
    .line 738
    iget-object v6, v7, LJ1/a;->p:LJ1/H;

    .line 739
    .line 740
    iget-object v8, v7, LJ1/a;->a:Ljava/util/ArrayList;

    .line 741
    .line 742
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 743
    .line 744
    .line 745
    move-result v9

    .line 746
    const/4 v12, 0x0

    .line 747
    :goto_18
    if-ge v12, v9, :cond_1d

    .line 748
    .line 749
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v10

    .line 753
    check-cast v10, LJ1/O;

    .line 754
    .line 755
    iget-object v11, v10, LJ1/O;->b:LJ1/q;

    .line 756
    .line 757
    if-eqz v11, :cond_21

    .line 758
    .line 759
    iget-object v13, v11, LJ1/q;->X:LJ1/p;

    .line 760
    .line 761
    if-nez v13, :cond_1f

    .line 762
    .line 763
    goto :goto_19

    .line 764
    :cond_1f
    invoke-virtual {v11}, LJ1/q;->g()LJ1/p;

    .line 765
    .line 766
    .line 767
    move-result-object v13

    .line 768
    const/4 v14, 0x0

    .line 769
    iput-boolean v14, v13, LJ1/p;->a:Z

    .line 770
    .line 771
    :goto_19
    iget v13, v7, LJ1/a;->f:I

    .line 772
    .line 773
    iget-object v14, v11, LJ1/q;->X:LJ1/p;

    .line 774
    .line 775
    if-nez v14, :cond_20

    .line 776
    .line 777
    if-nez v13, :cond_20

    .line 778
    .line 779
    goto :goto_1a

    .line 780
    :cond_20
    invoke-virtual {v11}, LJ1/q;->g()LJ1/p;

    .line 781
    .line 782
    .line 783
    iget-object v14, v11, LJ1/q;->X:LJ1/p;

    .line 784
    .line 785
    iput v13, v14, LJ1/p;->f:I

    .line 786
    .line 787
    :goto_1a
    invoke-virtual {v11}, LJ1/q;->g()LJ1/p;

    .line 788
    .line 789
    .line 790
    iget-object v13, v11, LJ1/q;->X:LJ1/p;

    .line 791
    .line 792
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    :cond_21
    iget v13, v10, LJ1/O;->a:I

    .line 796
    .line 797
    packed-switch v13, :pswitch_data_2

    .line 798
    .line 799
    .line 800
    :pswitch_f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 801
    .line 802
    new-instance v2, Ljava/lang/StringBuilder;

    .line 803
    .line 804
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 805
    .line 806
    .line 807
    iget v3, v10, LJ1/O;->a:I

    .line 808
    .line 809
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 817
    .line 818
    .line 819
    throw v0

    .line 820
    :pswitch_10
    iget-object v10, v10, LJ1/O;->i:Landroidx/lifecycle/p;

    .line 821
    .line 822
    invoke-virtual {v6, v11, v10}, LJ1/H;->V(LJ1/q;Landroidx/lifecycle/p;)V

    .line 823
    .line 824
    .line 825
    :goto_1b
    const/4 v14, 0x0

    .line 826
    goto/16 :goto_1c

    .line 827
    .line 828
    :pswitch_11
    const/4 v13, 0x0

    .line 829
    invoke-virtual {v6, v13}, LJ1/H;->W(LJ1/q;)V

    .line 830
    .line 831
    .line 832
    goto :goto_1b

    .line 833
    :pswitch_12
    const/4 v13, 0x0

    .line 834
    invoke-virtual {v6, v11}, LJ1/H;->W(LJ1/q;)V

    .line 835
    .line 836
    .line 837
    goto :goto_1b

    .line 838
    :pswitch_13
    const/4 v13, 0x0

    .line 839
    iget v14, v10, LJ1/O;->d:I

    .line 840
    .line 841
    iget v15, v10, LJ1/O;->e:I

    .line 842
    .line 843
    iget v13, v10, LJ1/O;->f:I

    .line 844
    .line 845
    iget v10, v10, LJ1/O;->g:I

    .line 846
    .line 847
    invoke-virtual {v11, v14, v15, v13, v10}, LJ1/q;->E(IIII)V

    .line 848
    .line 849
    .line 850
    const/4 v14, 0x0

    .line 851
    invoke-virtual {v6, v11, v14}, LJ1/H;->U(LJ1/q;Z)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {v6, v11}, LJ1/H;->c(LJ1/q;)V

    .line 855
    .line 856
    .line 857
    goto :goto_1b

    .line 858
    :pswitch_14
    iget v13, v10, LJ1/O;->d:I

    .line 859
    .line 860
    iget v14, v10, LJ1/O;->e:I

    .line 861
    .line 862
    iget v15, v10, LJ1/O;->f:I

    .line 863
    .line 864
    iget v10, v10, LJ1/O;->g:I

    .line 865
    .line 866
    invoke-virtual {v11, v13, v14, v15, v10}, LJ1/q;->E(IIII)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v6, v11}, LJ1/H;->g(LJ1/q;)V

    .line 870
    .line 871
    .line 872
    goto :goto_1b

    .line 873
    :pswitch_15
    iget v13, v10, LJ1/O;->d:I

    .line 874
    .line 875
    iget v14, v10, LJ1/O;->e:I

    .line 876
    .line 877
    iget v15, v10, LJ1/O;->f:I

    .line 878
    .line 879
    iget v10, v10, LJ1/O;->g:I

    .line 880
    .line 881
    invoke-virtual {v11, v13, v14, v15, v10}, LJ1/q;->E(IIII)V

    .line 882
    .line 883
    .line 884
    const/4 v14, 0x0

    .line 885
    invoke-virtual {v6, v11, v14}, LJ1/H;->U(LJ1/q;Z)V

    .line 886
    .line 887
    .line 888
    invoke-static {v11}, LJ1/H;->Y(LJ1/q;)V

    .line 889
    .line 890
    .line 891
    goto :goto_1b

    .line 892
    :pswitch_16
    iget v13, v10, LJ1/O;->d:I

    .line 893
    .line 894
    iget v14, v10, LJ1/O;->e:I

    .line 895
    .line 896
    iget v15, v10, LJ1/O;->f:I

    .line 897
    .line 898
    iget v10, v10, LJ1/O;->g:I

    .line 899
    .line 900
    invoke-virtual {v11, v13, v14, v15, v10}, LJ1/q;->E(IIII)V

    .line 901
    .line 902
    .line 903
    invoke-virtual {v6, v11}, LJ1/H;->E(LJ1/q;)V

    .line 904
    .line 905
    .line 906
    goto :goto_1b

    .line 907
    :pswitch_17
    iget v13, v10, LJ1/O;->d:I

    .line 908
    .line 909
    iget v14, v10, LJ1/O;->e:I

    .line 910
    .line 911
    iget v15, v10, LJ1/O;->f:I

    .line 912
    .line 913
    iget v10, v10, LJ1/O;->g:I

    .line 914
    .line 915
    invoke-virtual {v11, v13, v14, v15, v10}, LJ1/q;->E(IIII)V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v6, v11}, LJ1/H;->P(LJ1/q;)V

    .line 919
    .line 920
    .line 921
    goto :goto_1b

    .line 922
    :pswitch_18
    iget v13, v10, LJ1/O;->d:I

    .line 923
    .line 924
    iget v14, v10, LJ1/O;->e:I

    .line 925
    .line 926
    iget v15, v10, LJ1/O;->f:I

    .line 927
    .line 928
    iget v10, v10, LJ1/O;->g:I

    .line 929
    .line 930
    invoke-virtual {v11, v13, v14, v15, v10}, LJ1/q;->E(IIII)V

    .line 931
    .line 932
    .line 933
    const/4 v14, 0x0

    .line 934
    invoke-virtual {v6, v11, v14}, LJ1/H;->U(LJ1/q;Z)V

    .line 935
    .line 936
    .line 937
    invoke-virtual {v6, v11}, LJ1/H;->a(LJ1/q;)LJ1/N;

    .line 938
    .line 939
    .line 940
    :goto_1c
    add-int/lit8 v12, v12, 0x1

    .line 941
    .line 942
    goto/16 :goto_18

    .line 943
    .line 944
    :goto_1d
    add-int/lit8 v5, v5, 0x1

    .line 945
    .line 946
    goto/16 :goto_11

    .line 947
    .line 948
    :cond_22
    const/4 v14, 0x0

    .line 949
    add-int/lit8 v4, v3, -0x1

    .line 950
    .line 951
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    check-cast v4, Ljava/lang/Boolean;

    .line 956
    .line 957
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 958
    .line 959
    .line 960
    move-result v4

    .line 961
    move/from16 v5, p3

    .line 962
    .line 963
    :goto_1e
    if-ge v5, v3, :cond_27

    .line 964
    .line 965
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 966
    .line 967
    .line 968
    move-result-object v7

    .line 969
    check-cast v7, LJ1/a;

    .line 970
    .line 971
    if-eqz v4, :cond_24

    .line 972
    .line 973
    iget-object v8, v7, LJ1/a;->a:Ljava/util/ArrayList;

    .line 974
    .line 975
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 976
    .line 977
    .line 978
    move-result v8

    .line 979
    const/16 v16, 0x1

    .line 980
    .line 981
    add-int/lit8 v8, v8, -0x1

    .line 982
    .line 983
    :goto_1f
    if-ltz v8, :cond_26

    .line 984
    .line 985
    iget-object v9, v7, LJ1/a;->a:Ljava/util/ArrayList;

    .line 986
    .line 987
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v9

    .line 991
    check-cast v9, LJ1/O;

    .line 992
    .line 993
    iget-object v9, v9, LJ1/O;->b:LJ1/q;

    .line 994
    .line 995
    if-eqz v9, :cond_23

    .line 996
    .line 997
    invoke-virtual {v1, v9}, LJ1/H;->f(LJ1/q;)LJ1/N;

    .line 998
    .line 999
    .line 1000
    move-result-object v9

    .line 1001
    invoke-virtual {v9}, LJ1/N;->k()V

    .line 1002
    .line 1003
    .line 1004
    :cond_23
    add-int/lit8 v8, v8, -0x1

    .line 1005
    .line 1006
    goto :goto_1f

    .line 1007
    :cond_24
    iget-object v7, v7, LJ1/a;->a:Ljava/util/ArrayList;

    .line 1008
    .line 1009
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 1010
    .line 1011
    .line 1012
    move-result v8

    .line 1013
    move v12, v14

    .line 1014
    :cond_25
    :goto_20
    if-ge v12, v8, :cond_26

    .line 1015
    .line 1016
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v9

    .line 1020
    add-int/lit8 v12, v12, 0x1

    .line 1021
    .line 1022
    check-cast v9, LJ1/O;

    .line 1023
    .line 1024
    iget-object v9, v9, LJ1/O;->b:LJ1/q;

    .line 1025
    .line 1026
    if-eqz v9, :cond_25

    .line 1027
    .line 1028
    invoke-virtual {v1, v9}, LJ1/H;->f(LJ1/q;)LJ1/N;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v9

    .line 1032
    invoke-virtual {v9}, LJ1/N;->k()V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_20

    .line 1036
    :cond_26
    add-int/lit8 v5, v5, 0x1

    .line 1037
    .line 1038
    goto :goto_1e

    .line 1039
    :cond_27
    iget v5, v1, LJ1/H;->s:I

    .line 1040
    .line 1041
    const/4 v10, 0x1

    .line 1042
    invoke-virtual {v1, v5, v10}, LJ1/H;->K(IZ)V

    .line 1043
    .line 1044
    .line 1045
    new-instance v5, Ljava/util/HashSet;

    .line 1046
    .line 1047
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 1048
    .line 1049
    .line 1050
    move/from16 v7, p3

    .line 1051
    .line 1052
    :goto_21
    if-ge v7, v3, :cond_2a

    .line 1053
    .line 1054
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v8

    .line 1058
    check-cast v8, LJ1/a;

    .line 1059
    .line 1060
    iget-object v8, v8, LJ1/a;->a:Ljava/util/ArrayList;

    .line 1061
    .line 1062
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 1063
    .line 1064
    .line 1065
    move-result v9

    .line 1066
    move v12, v14

    .line 1067
    :cond_28
    :goto_22
    if-ge v12, v9, :cond_29

    .line 1068
    .line 1069
    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v10

    .line 1073
    add-int/lit8 v12, v12, 0x1

    .line 1074
    .line 1075
    check-cast v10, LJ1/O;

    .line 1076
    .line 1077
    iget-object v10, v10, LJ1/O;->b:LJ1/q;

    .line 1078
    .line 1079
    if-eqz v10, :cond_28

    .line 1080
    .line 1081
    iget-object v10, v10, LJ1/q;->T:Landroid/view/ViewGroup;

    .line 1082
    .line 1083
    if-eqz v10, :cond_28

    .line 1084
    .line 1085
    invoke-virtual {v1}, LJ1/H;->D()Lx3/k;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v11

    .line 1089
    invoke-static {v10, v11}, LJ1/h;->f(Landroid/view/ViewGroup;Lx3/k;)LJ1/h;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v10

    .line 1093
    invoke-virtual {v5, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 1094
    .line 1095
    .line 1096
    goto :goto_22

    .line 1097
    :cond_29
    add-int/lit8 v7, v7, 0x1

    .line 1098
    .line 1099
    goto :goto_21

    .line 1100
    :cond_2a
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v5

    .line 1104
    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1105
    .line 1106
    .line 1107
    move-result v7

    .line 1108
    if-eqz v7, :cond_2d

    .line 1109
    .line 1110
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v7

    .line 1114
    check-cast v7, LJ1/h;

    .line 1115
    .line 1116
    iput-boolean v4, v7, LJ1/h;->d:Z

    .line 1117
    .line 1118
    iget-object v8, v7, LJ1/h;->b:Ljava/util/ArrayList;

    .line 1119
    .line 1120
    monitor-enter v8

    .line 1121
    :try_start_0
    invoke-virtual {v7}, LJ1/h;->g()V

    .line 1122
    .line 1123
    .line 1124
    const/4 v9, 0x0

    .line 1125
    iput-boolean v9, v7, LJ1/h;->e:Z

    .line 1126
    .line 1127
    iget-object v10, v7, LJ1/h;->b:Ljava/util/ArrayList;

    .line 1128
    .line 1129
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1130
    .line 1131
    .line 1132
    move-result v10

    .line 1133
    add-int/lit8 v10, v10, -0x1

    .line 1134
    .line 1135
    :goto_24
    if-ltz v10, :cond_2c

    .line 1136
    .line 1137
    iget-object v11, v7, LJ1/h;->b:Ljava/util/ArrayList;

    .line 1138
    .line 1139
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v11

    .line 1143
    check-cast v11, LJ1/T;

    .line 1144
    .line 1145
    iget-object v12, v11, LJ1/T;->c:LJ1/q;

    .line 1146
    .line 1147
    iget-object v12, v12, LJ1/q;->U:Landroid/view/View;

    .line 1148
    .line 1149
    invoke-static {v12}, LC0/S;->c(Landroid/view/View;)I

    .line 1150
    .line 1151
    .line 1152
    move-result v12

    .line 1153
    iget v13, v11, LJ1/T;->a:I

    .line 1154
    .line 1155
    const/4 v14, 0x2

    .line 1156
    if-ne v13, v14, :cond_2b

    .line 1157
    .line 1158
    if-eq v12, v14, :cond_2b

    .line 1159
    .line 1160
    iget-object v10, v11, LJ1/T;->c:LJ1/q;

    .line 1161
    .line 1162
    iget-object v10, v10, LJ1/q;->X:LJ1/p;

    .line 1163
    .line 1164
    iput-boolean v9, v7, LJ1/h;->e:Z

    .line 1165
    .line 1166
    goto :goto_25

    .line 1167
    :catchall_0
    move-exception v0

    .line 1168
    goto :goto_26

    .line 1169
    :cond_2b
    add-int/lit8 v10, v10, -0x1

    .line 1170
    .line 1171
    goto :goto_24

    .line 1172
    :cond_2c
    :goto_25
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1173
    invoke-virtual {v7}, LJ1/h;->c()V

    .line 1174
    .line 1175
    .line 1176
    goto :goto_23

    .line 1177
    :goto_26
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1178
    throw v0

    .line 1179
    :cond_2d
    move/from16 v4, p3

    .line 1180
    .line 1181
    :goto_27
    if-ge v4, v3, :cond_2f

    .line 1182
    .line 1183
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v5

    .line 1187
    check-cast v5, LJ1/a;

    .line 1188
    .line 1189
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v7

    .line 1193
    check-cast v7, Ljava/lang/Boolean;

    .line 1194
    .line 1195
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v7

    .line 1199
    if-eqz v7, :cond_2e

    .line 1200
    .line 1201
    iget v7, v5, LJ1/a;->r:I

    .line 1202
    .line 1203
    if-ltz v7, :cond_2e

    .line 1204
    .line 1205
    iput v6, v5, LJ1/a;->r:I

    .line 1206
    .line 1207
    :cond_2e
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    add-int/lit8 v4, v4, 0x1

    .line 1211
    .line 1212
    goto :goto_27

    .line 1213
    :cond_2f
    return-void

    .line 1214
    nop

    .line 1215
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method
