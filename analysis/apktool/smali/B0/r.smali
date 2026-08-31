.class public final LB0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements LC5/a;


# instance fields
.field public final synthetic q:I

.field public r:I

.field public s:I

.field public t:I

.field public final u:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LB0/t;II)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LB0/r;->q:I

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    move p2, v0

    .line 1
    :cond_0
    iget-object p3, p1, LB0/t;->q:Lr/C;

    .line 2
    iget p3, p3, Lr/C;->b:I

    .line 3
    invoke-direct {p0, p1, p2, v0, p3}, LB0/r;-><init>(LB0/t;III)V

    return-void
.end method

.method public constructor <init>(LB0/t;III)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LB0/r;->q:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 10
    iput p2, p0, LB0/r;->r:I

    .line 11
    iput p3, p0, LB0/r;->s:I

    .line 12
    iput p4, p0, LB0/r;->t:I

    return-void
.end method

.method public constructor <init>(La0/q;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LB0/r;->q:I

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB0/r;->u:Ljava/lang/Object;

    add-int/lit8 p2, p2, -0x1

    .line 14
    iput p2, p0, LB0/r;->r:I

    const/4 p2, -0x1

    .line 15
    iput p2, p0, LB0/r;->s:I

    .line 16
    invoke-virtual {p1}, La0/q;->k()I

    move-result p1

    iput p1, p0, LB0/r;->t:I

    return-void
.end method

.method public constructor <init>(Lo5/a;I)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LB0/r;->q:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 19
    iput p2, p0, LB0/r;->r:I

    const/4 p2, -0x1

    .line 20
    iput p2, p0, LB0/r;->s:I

    .line 21
    invoke-static {p1}, Lo5/a;->h(Lo5/a;)I

    move-result p1

    iput p1, p0, LB0/r;->t:I

    return-void
.end method

.method public constructor <init>(Lo5/b;I)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LB0/r;->q:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 6
    iput p2, p0, LB0/r;->r:I

    const/4 p2, -0x1

    .line 7
    iput p2, p0, LB0/r;->s:I

    .line 8
    invoke-static {p1}, Lo5/b;->h(Lo5/b;)I

    move-result p1

    iput p1, p0, LB0/r;->t:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo5/a;

    .line 4
    .line 5
    iget-object v0, v0, Lo5/a;->u:Lo5/b;

    .line 6
    .line 7
    invoke-static {v0}, Lo5/b;->h(Lo5/b;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, LB0/r;->t:I

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public final add(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LB0/r;->b()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lo5/b;

    .line 12
    .line 13
    iget v1, p0, LB0/r;->r:I

    .line 14
    .line 15
    add-int/lit8 v2, v1, 0x1

    .line 16
    .line 17
    iput v2, p0, LB0/r;->r:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, p1}, Lo5/b;->add(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, -0x1

    .line 23
    iput p1, p0, LB0/r;->s:I

    .line 24
    .line 25
    invoke-static {v0}, Lo5/b;->h(Lo5/b;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, LB0/r;->t:I

    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    invoke-virtual {p0}, LB0/r;->a()V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lo5/a;

    .line 38
    .line 39
    iget v1, p0, LB0/r;->r:I

    .line 40
    .line 41
    add-int/lit8 v2, v1, 0x1

    .line 42
    .line 43
    iput v2, p0, LB0/r;->r:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, p1}, Lo5/a;->add(ILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    const/4 p1, -0x1

    .line 49
    iput p1, p0, LB0/r;->s:I

    .line 50
    .line 51
    invoke-static {v0}, Lo5/a;->h(Lo5/a;)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    iput p1, p0, LB0/r;->t:I

    .line 56
    .line 57
    return-void

    .line 58
    :pswitch_1
    invoke-virtual {p0}, LB0/r;->c()V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, La0/q;

    .line 64
    .line 65
    iget v1, p0, LB0/r;->r:I

    .line 66
    .line 67
    add-int/lit8 v1, v1, 0x1

    .line 68
    .line 69
    invoke-virtual {v0, v1, p1}, La0/q;->add(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 p1, -0x1

    .line 73
    iput p1, p0, LB0/r;->s:I

    .line 74
    .line 75
    iget p1, p0, LB0/r;->r:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0x1

    .line 78
    .line 79
    iput p1, p0, LB0/r;->r:I

    .line 80
    .line 81
    invoke-virtual {v0}, La0/q;->k()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iput p1, p0, LB0/r;->t:I

    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 89
    .line 90
    const-string v0, "Operation is not supported for read-only collection"

    .line 91
    .line 92
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p1

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo5/b;

    .line 4
    .line 5
    invoke-static {v0}, Lo5/b;->h(Lo5/b;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, LB0/r;->t:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public c()V
    .locals 2

    .line 1
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La0/q;

    .line 4
    .line 5
    invoke-virtual {v0}, La0/q;->k()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, LB0/r;->t:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v0
.end method

.method public final hasNext()Z
    .locals 3

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LB0/r;->r:I

    .line 7
    .line 8
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lo5/b;

    .line 11
    .line 12
    iget v1, v1, Lo5/b;->r:I

    .line 13
    .line 14
    if-ge v0, v1, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    return v0

    .line 20
    :pswitch_0
    iget v0, p0, LB0/r;->r:I

    .line 21
    .line 22
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lo5/a;

    .line 25
    .line 26
    iget v1, v1, Lo5/a;->s:I

    .line 27
    .line 28
    if-ge v0, v1, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_1
    return v0

    .line 34
    :pswitch_1
    iget v0, p0, LB0/r;->r:I

    .line 35
    .line 36
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La0/q;

    .line 39
    .line 40
    invoke-virtual {v1}, La0/q;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x1

    .line 45
    sub-int/2addr v1, v2

    .line 46
    if-ge v0, v1, :cond_2

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/4 v2, 0x0

    .line 50
    :goto_2
    return v2

    .line 51
    :pswitch_2
    iget v0, p0, LB0/r;->r:I

    .line 52
    .line 53
    iget v1, p0, LB0/r;->t:I

    .line 54
    .line 55
    if-ge v0, v1, :cond_3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    :goto_3
    return v0

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final hasPrevious()Z
    .locals 2

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LB0/r;->r:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    return v0

    .line 14
    :pswitch_0
    iget v0, p0, LB0/r;->r:I

    .line 15
    .line 16
    if-lez v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 v0, 0x0

    .line 21
    :goto_1
    return v0

    .line 22
    :pswitch_1
    iget v0, p0, LB0/r;->r:I

    .line 23
    .line 24
    if-ltz v0, :cond_2

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    :goto_2
    return v0

    .line 30
    :pswitch_2
    iget v0, p0, LB0/r;->r:I

    .line 31
    .line 32
    iget v1, p0, LB0/r;->s:I

    .line 33
    .line 34
    if-le v0, v1, :cond_3

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    const/4 v0, 0x0

    .line 39
    :goto_3
    return v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LB0/r;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LB0/r;->r:I

    .line 10
    .line 11
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lo5/b;

    .line 14
    .line 15
    iget v2, v1, Lo5/b;->r:I

    .line 16
    .line 17
    if-ge v0, v2, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    iput v2, p0, LB0/r;->r:I

    .line 22
    .line 23
    iput v0, p0, LB0/r;->s:I

    .line 24
    .line 25
    iget-object v1, v1, Lo5/b;->q:[Ljava/lang/Object;

    .line 26
    .line 27
    aget-object v0, v1, v0

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :pswitch_0
    invoke-virtual {p0}, LB0/r;->a()V

    .line 37
    .line 38
    .line 39
    iget v0, p0, LB0/r;->r:I

    .line 40
    .line 41
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lo5/a;

    .line 44
    .line 45
    iget v2, v1, Lo5/a;->s:I

    .line 46
    .line 47
    if-ge v0, v2, :cond_1

    .line 48
    .line 49
    add-int/lit8 v2, v0, 0x1

    .line 50
    .line 51
    iput v2, p0, LB0/r;->r:I

    .line 52
    .line 53
    iput v0, p0, LB0/r;->s:I

    .line 54
    .line 55
    iget-object v2, v1, Lo5/a;->q:[Ljava/lang/Object;

    .line 56
    .line 57
    iget v1, v1, Lo5/a;->r:I

    .line 58
    .line 59
    add-int/2addr v1, v0

    .line 60
    aget-object v0, v2, v1

    .line 61
    .line 62
    return-object v0

    .line 63
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :pswitch_1
    invoke-virtual {p0}, LB0/r;->c()V

    .line 70
    .line 71
    .line 72
    iget v0, p0, LB0/r;->r:I

    .line 73
    .line 74
    add-int/lit8 v0, v0, 0x1

    .line 75
    .line 76
    iput v0, p0, LB0/r;->s:I

    .line 77
    .line 78
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La0/q;

    .line 81
    .line 82
    invoke-virtual {v1}, La0/q;->size()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-static {v0, v2}, La0/r;->a(II)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v0}, La0/q;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    iput v0, p0, LB0/r;->r:I

    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_2
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LB0/t;

    .line 99
    .line 100
    iget-object v0, v0, LB0/t;->q:Lr/C;

    .line 101
    .line 102
    iget v1, p0, LB0/r;->r:I

    .line 103
    .line 104
    add-int/lit8 v2, v1, 0x1

    .line 105
    .line 106
    iput v2, p0, LB0/r;->r:I

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Lr/C;->e(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    .line 113
    .line 114
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    check-cast v0, Lc0/l;

    .line 118
    .line 119
    return-object v0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final nextIndex()I
    .locals 2

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LB0/r;->r:I

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget v0, p0, LB0/r;->r:I

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    iget v0, p0, LB0/r;->r:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    return v0

    .line 17
    :pswitch_2
    iget v0, p0, LB0/r;->r:I

    .line 18
    .line 19
    iget v1, p0, LB0/r;->s:I

    .line 20
    .line 21
    sub-int/2addr v0, v1

    .line 22
    return v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previous()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LB0/r;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LB0/r;->r:I

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    add-int/lit8 v0, v0, -0x1

    .line 14
    .line 15
    iput v0, p0, LB0/r;->r:I

    .line 16
    .line 17
    iput v0, p0, LB0/r;->s:I

    .line 18
    .line 19
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, Lo5/b;

    .line 22
    .line 23
    iget-object v1, v1, Lo5/b;->q:[Ljava/lang/Object;

    .line 24
    .line 25
    aget-object v0, v1, v0

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :pswitch_0
    invoke-virtual {p0}, LB0/r;->a()V

    .line 35
    .line 36
    .line 37
    iget v0, p0, LB0/r;->r:I

    .line 38
    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    iput v0, p0, LB0/r;->r:I

    .line 44
    .line 45
    iput v0, p0, LB0/r;->s:I

    .line 46
    .line 47
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lo5/a;

    .line 50
    .line 51
    iget-object v2, v1, Lo5/a;->q:[Ljava/lang/Object;

    .line 52
    .line 53
    iget v1, v1, Lo5/a;->r:I

    .line 54
    .line 55
    add-int/2addr v1, v0

    .line 56
    aget-object v0, v2, v1

    .line 57
    .line 58
    return-object v0

    .line 59
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 60
    .line 61
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :pswitch_1
    invoke-virtual {p0}, LB0/r;->c()V

    .line 66
    .line 67
    .line 68
    iget v0, p0, LB0/r;->r:I

    .line 69
    .line 70
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v1, La0/q;

    .line 73
    .line 74
    invoke-virtual {v1}, La0/q;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-static {v0, v2}, La0/r;->a(II)V

    .line 79
    .line 80
    .line 81
    iget v0, p0, LB0/r;->r:I

    .line 82
    .line 83
    iput v0, p0, LB0/r;->s:I

    .line 84
    .line 85
    invoke-virtual {v1, v0}, La0/q;->get(I)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iget v1, p0, LB0/r;->r:I

    .line 90
    .line 91
    add-int/lit8 v1, v1, -0x1

    .line 92
    .line 93
    iput v1, p0, LB0/r;->r:I

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_2
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, LB0/t;

    .line 99
    .line 100
    iget-object v0, v0, LB0/t;->q:Lr/C;

    .line 101
    .line 102
    iget v1, p0, LB0/r;->r:I

    .line 103
    .line 104
    add-int/lit8 v1, v1, -0x1

    .line 105
    .line 106
    iput v1, p0, LB0/r;->r:I

    .line 107
    .line 108
    invoke-virtual {v0, v1}, Lr/C;->e(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node"

    .line 113
    .line 114
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    check-cast v0, Lc0/l;

    .line 118
    .line 119
    return-object v0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final previousIndex()I
    .locals 2

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, LB0/r;->r:I

    .line 7
    .line 8
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    return v0

    .line 11
    :pswitch_0
    iget v0, p0, LB0/r;->r:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :pswitch_1
    iget v0, p0, LB0/r;->r:I

    .line 15
    .line 16
    return v0

    .line 17
    :pswitch_2
    iget v0, p0, LB0/r;->r:I

    .line 18
    .line 19
    iget v1, p0, LB0/r;->s:I

    .line 20
    .line 21
    sub-int/2addr v0, v1

    .line 22
    goto :goto_0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lo5/b;

    .line 9
    .line 10
    invoke-virtual {p0}, LB0/r;->b()V

    .line 11
    .line 12
    .line 13
    iget v1, p0, LB0/r;->s:I

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lo5/b;->g(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget v1, p0, LB0/r;->s:I

    .line 22
    .line 23
    iput v1, p0, LB0/r;->r:I

    .line 24
    .line 25
    iput v2, p0, LB0/r;->s:I

    .line 26
    .line 27
    invoke-static {v0}, Lo5/b;->h(Lo5/b;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iput v0, p0, LB0/r;->t:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v1, "Call next() or previous() before removing element from the iterator."

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0

    .line 42
    :pswitch_0
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lo5/a;

    .line 45
    .line 46
    invoke-virtual {p0}, LB0/r;->a()V

    .line 47
    .line 48
    .line 49
    iget v1, p0, LB0/r;->s:I

    .line 50
    .line 51
    const/4 v2, -0x1

    .line 52
    if-eq v1, v2, :cond_1

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lo5/a;->g(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    iget v1, p0, LB0/r;->s:I

    .line 58
    .line 59
    iput v1, p0, LB0/r;->r:I

    .line 60
    .line 61
    iput v2, p0, LB0/r;->s:I

    .line 62
    .line 63
    invoke-static {v0}, Lo5/a;->h(Lo5/a;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iput v0, p0, LB0/r;->t:I

    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string v1, "Call next() or previous() before removing element from the iterator."

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :pswitch_1
    invoke-virtual {p0}, LB0/r;->c()V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La0/q;

    .line 84
    .line 85
    iget v1, p0, LB0/r;->r:I

    .line 86
    .line 87
    invoke-virtual {v0, v1}, La0/q;->remove(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    iget v1, p0, LB0/r;->r:I

    .line 91
    .line 92
    const/4 v2, -0x1

    .line 93
    add-int/2addr v1, v2

    .line 94
    iput v1, p0, LB0/r;->r:I

    .line 95
    .line 96
    iput v2, p0, LB0/r;->s:I

    .line 97
    .line 98
    invoke-virtual {v0}, La0/q;->k()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iput v0, p0, LB0/r;->t:I

    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_2
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 106
    .line 107
    const-string v1, "Operation is not supported for read-only collection"

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v0

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LB0/r;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LB0/r;->b()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, LB0/r;->s:I

    .line 10
    .line 11
    const/4 v1, -0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lo5/b;

    .line 17
    .line 18
    invoke-virtual {v1, v0, p1}, Lo5/b;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "Call next() or previous() before replacing element from the iterator."

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :pswitch_0
    invoke-virtual {p0}, LB0/r;->a()V

    .line 31
    .line 32
    .line 33
    iget v0, p0, LB0/r;->s:I

    .line 34
    .line 35
    const/4 v1, -0x1

    .line 36
    if-eq v0, v1, :cond_1

    .line 37
    .line 38
    iget-object v1, p0, LB0/r;->u:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v1, Lo5/a;

    .line 41
    .line 42
    invoke-virtual {v1, v0, p1}, Lo5/a;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "Call next() or previous() before replacing element from the iterator."

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :pswitch_1
    iget-object v0, p0, LB0/r;->u:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, La0/q;

    .line 57
    .line 58
    invoke-virtual {p0}, LB0/r;->c()V

    .line 59
    .line 60
    .line 61
    iget v1, p0, LB0/r;->s:I

    .line 62
    .line 63
    if-ltz v1, :cond_2

    .line 64
    .line 65
    invoke-virtual {v0, v1, p1}, La0/q;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, La0/q;->k()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iput p1, p0, LB0/r;->t:I

    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 76
    .line 77
    const-string v0, "Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()"

    .line 78
    .line 79
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p1

    .line 83
    :pswitch_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 84
    .line 85
    const-string v0, "Operation is not supported for read-only collection"

    .line 86
    .line 87
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
