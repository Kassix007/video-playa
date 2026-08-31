.class public final Lv/s;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Li0/c;

.field public final synthetic r:Lkotlin/jvm/internal/y;

.field public final synthetic s:J

.field public final synthetic t:Lj0/j;


# direct methods
.method public constructor <init>(Li0/c;Lkotlin/jvm/internal/y;JLj0/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lv/s;->q:Li0/c;

    .line 2
    .line 3
    iput-object p2, p0, Lv/s;->r:Lkotlin/jvm/internal/y;

    .line 4
    .line 5
    iput-wide p3, p0, Lv/s;->s:J

    .line 6
    .line 7
    iput-object p5, p0, Lv/s;->t:Lj0/j;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, LB0/N;

    .line 3
    .line 4
    invoke-virtual {v0}, LB0/N;->a()V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lv/s;->q:Li0/c;

    .line 8
    .line 9
    iget v10, p1, Li0/c;->a:F

    .line 10
    .line 11
    iget p1, p1, Li0/c;->b:F

    .line 12
    .line 13
    iget-object v1, p0, Lv/s;->r:Lkotlin/jvm/internal/y;

    .line 14
    .line 15
    iget-wide v2, p0, Lv/s;->s:J

    .line 16
    .line 17
    iget-object v7, p0, Lv/s;->t:Lj0/j;

    .line 18
    .line 19
    iget-object v11, v0, LB0/N;->q:Ll0/b;

    .line 20
    .line 21
    iget-object v4, v11, Ll0/b;->r:LB0/G0;

    .line 22
    .line 23
    iget-object v4, v4, LB0/G0;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Li1/a;

    .line 26
    .line 27
    invoke-virtual {v4, v10, p1}, Li1/a;->A(FF)V

    .line 28
    .line 29
    .line 30
    :try_start_0
    iget-object v1, v1, Lkotlin/jvm/internal/y;->q:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Lj0/e;

    .line 33
    .line 34
    const/4 v8, 0x0

    .line 35
    const/16 v9, 0x37a

    .line 36
    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-static/range {v0 .. v9}, Ll0/d;->y(Ll0/d;Lj0/e;JJFLj0/j;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    iget-object v0, v11, Ll0/b;->r:LB0/G0;

    .line 44
    .line 45
    iget-object v0, v0, LB0/G0;->r:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Li1/a;

    .line 48
    .line 49
    neg-float v1, v10

    .line 50
    neg-float p1, p1

    .line 51
    invoke-virtual {v0, v1, p1}, Li1/a;->A(FF)V

    .line 52
    .line 53
    .line 54
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 55
    .line 56
    return-object p1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    iget-object v1, v11, Ll0/b;->r:LB0/G0;

    .line 59
    .line 60
    iget-object v1, v1, LB0/G0;->r:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Li1/a;

    .line 63
    .line 64
    neg-float v2, v10

    .line 65
    neg-float p1, p1

    .line 66
    invoke-virtual {v1, v2, p1}, Li1/a;->A(FF)V

    .line 67
    .line 68
    .line 69
    throw v0
.end method
