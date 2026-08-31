.class public abstract Lj6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/G;


# instance fields
.field public final q:Lq6/p;

.field public r:Z

.field public final synthetic s:Lj6/f;


# direct methods
.method public constructor <init>(Lj6/f;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj6/a;->s:Lj6/f;

    .line 5
    .line 6
    new-instance v0, Lq6/p;

    .line 7
    .line 8
    iget-object p1, p1, Lj6/f;->c:Lq6/i;

    .line 9
    .line 10
    invoke-interface {p1}, Lq6/G;->d()Lq6/I;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, Lq6/p;-><init>(Lq6/I;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lj6/a;->q:Lq6/p;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public F(JLq6/g;)J
    .locals 2

    .line 1
    iget-object v0, p0, Lj6/a;->s:Lj6/f;

    .line 2
    .line 3
    const-string v1, "sink"

    .line 4
    .line 5
    invoke-static {p3, v1}, Lkotlin/jvm/internal/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, Lj6/f;->c:Lq6/i;

    .line 9
    .line 10
    invoke-interface {v1, p1, p2, p3}, Lq6/G;->F(JLq6/g;)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 14
    return-wide p1

    .line 15
    :catch_0
    move-exception p1

    .line 16
    iget-object p2, v0, Lj6/f;->b:Lh6/j;

    .line 17
    .line 18
    invoke-virtual {p2}, Lh6/j;->k()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lj6/a;->a()V

    .line 22
    .line 23
    .line 24
    throw p1
.end method

.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lj6/a;->s:Lj6/f;

    .line 2
    .line 3
    iget v1, v0, Lj6/f;->e:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v3, 0x5

    .line 10
    if-ne v1, v3, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lj6/a;->q:Lq6/p;

    .line 13
    .line 14
    iget-object v3, v1, Lq6/p;->e:Lq6/I;

    .line 15
    .line 16
    sget-object v4, Lq6/I;->d:Lq6/H;

    .line 17
    .line 18
    iput-object v4, v1, Lq6/p;->e:Lq6/I;

    .line 19
    .line 20
    invoke-virtual {v3}, Lq6/I;->a()Lq6/I;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lq6/I;->b()Lq6/I;

    .line 24
    .line 25
    .line 26
    iput v2, v0, Lj6/f;->e:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    new-instance v2, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v3, "state: "

    .line 34
    .line 35
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget v0, v0, Lj6/f;->e:I

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw v1
.end method

.method public final d()Lq6/I;
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/a;->q:Lq6/p;

    .line 2
    .line 3
    return-object v0
.end method
