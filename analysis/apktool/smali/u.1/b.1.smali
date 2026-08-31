.class public final Lu/b;
.super Ls5/i;
.source "SourceFile"

# interfaces
.implements LB5/c;


# instance fields
.field public final synthetic q:Lu/c;

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu/c;Ljava/lang/Object;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu/b;->q:Lu/c;

    .line 2
    .line 3
    iput-object p2, p0, Lu/b;->r:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Ls5/i;-><init>(ILq5/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lq5/c;)Lq5/c;
    .locals 3

    .line 1
    new-instance v0, Lu/b;

    .line 2
    .line 3
    iget-object v1, p0, Lu/b;->q:Lu/c;

    .line 4
    .line 5
    iget-object v2, p0, Lu/b;->r:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lu/b;-><init>(Lu/c;Ljava/lang/Object;Lq5/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lq5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lu/b;->create(Lq5/c;)Lq5/c;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lu/b;

    .line 8
    .line 9
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lu/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lu/b;->q:Lu/c;

    .line 5
    .line 6
    invoke-static {p1}, Lu/c;->b(Lu/c;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lu/b;->r:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lu/c;->a(Lu/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p1, Lu/c;->c:Lu/l;

    .line 16
    .line 17
    iget-object v1, v1, Lu/l;->r:LP/f0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p1, Lu/c;->e:LP/f0;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, LP/f0;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 28
    .line 29
    return-object p1
.end method
