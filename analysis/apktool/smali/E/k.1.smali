.class public final LE/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LR/e;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, LR/e;

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    new-array v0, v0, [LE/j;

    .line 12
    .line 13
    invoke-direct {p1, v0}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LE/k;->a:LR/e;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, LR/e;

    .line 23
    .line 24
    const/16 v0, 0x10

    .line 25
    .line 26
    new-array v0, v0, [Lw/g;

    .line 27
    .line 28
    invoke-direct {p1, v0}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, LE/k;->a:LR/e;

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/util/concurrent/CancellationException;)V
    .locals 6

    .line 1
    iget-object v0, p0, LE/k;->a:LR/e;

    .line 2
    .line 3
    iget v1, v0, LR/e;->s:I

    .line 4
    .line 5
    new-array v2, v1, [LM5/f;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move v4, v3

    .line 9
    :goto_0
    if-ge v4, v1, :cond_0

    .line 10
    .line 11
    iget-object v5, v0, LR/e;->q:[Ljava/lang/Object;

    .line 12
    .line 13
    aget-object v5, v5, v4

    .line 14
    .line 15
    check-cast v5, Lw/g;

    .line 16
    .line 17
    iget-object v5, v5, Lw/g;->b:LM5/h;

    .line 18
    .line 19
    aput-object v5, v2, v4

    .line 20
    .line 21
    add-int/lit8 v4, v4, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    :goto_1
    if-ge v3, v1, :cond_1

    .line 25
    .line 26
    aget-object v4, v2, v3

    .line 27
    .line 28
    invoke-interface {v4, p1}, LM5/f;->g(Ljava/lang/Throwable;)Z

    .line 29
    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget p1, v0, LR/e;->s:I

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    const-string p1, "uncancelled requests present"

    .line 40
    .line 41
    invoke-static {p1}, Lz/a;->c(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public b()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LE/k;->a:LR/e;

    .line 3
    .line 4
    iget v2, v1, LR/e;->s:I

    .line 5
    .line 6
    invoke-static {v0, v2}, LD5/a;->O(II)LG5/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v2, v0, LG5/b;->q:I

    .line 11
    .line 12
    iget v0, v0, LG5/b;->r:I

    .line 13
    .line 14
    if-gt v2, v0, :cond_0

    .line 15
    .line 16
    :goto_0
    iget-object v3, v1, LR/e;->q:[Ljava/lang/Object;

    .line 17
    .line 18
    aget-object v3, v3, v2

    .line 19
    .line 20
    check-cast v3, Lw/g;

    .line 21
    .line 22
    iget-object v3, v3, Lw/g;->b:LM5/h;

    .line 23
    .line 24
    sget-object v4, Lm5/y;->a:Lm5/y;

    .line 25
    .line 26
    invoke-virtual {v3, v4}, LM5/h;->resumeWith(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    if-eq v2, v0, :cond_0

    .line 30
    .line 31
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, LR/e;->i()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
