.class public final Lw/u0;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public synthetic q:Ljava/lang/Object;

.field public final synthetic r:J


# direct methods
.method public constructor <init>(JLq5/c;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lw/u0;->r:J

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lw/u0;

    .line 2
    .line 3
    iget-wide v1, p0, Lw/u0;->r:J

    .line 4
    .line 5
    invoke-direct {v0, v1, v2, p2}, Lw/u0;-><init>(JLq5/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lw/u0;->q:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/E0;

    .line 2
    .line 3
    check-cast p2, Lq5/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lw/u0;->create(Ljava/lang/Object;Lq5/c;)Lq5/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lw/u0;

    .line 10
    .line 11
    sget-object p2, Lm5/y;->a:Lm5/y;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lw/u0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lw/u0;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Lw/E0;

    .line 7
    .line 8
    iget-object p1, p1, Lw/E0;->a:Lw/H0;

    .line 9
    .line 10
    iget-object v0, p1, Lw/H0;->j:Lw/i0;

    .line 11
    .line 12
    iget-wide v1, p0, Lw/u0;->r:J

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-static {p1, v0, v1, v2, v3}, Lw/H0;->a(Lw/H0;Lw/i0;JI)J

    .line 16
    .line 17
    .line 18
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 19
    .line 20
    return-object p1
.end method
