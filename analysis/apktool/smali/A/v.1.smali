.class public final LA/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA0/c;


# instance fields
.field public final q:LB5/c;

.field public r:LA/W;


# direct methods
.method public constructor <init>(LB5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LA/v;->q:LB5/c;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final e(LA0/g;)V
    .locals 1

    .line 1
    sget-object v0, LA/c0;->a:LA0/h;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LA0/g;->e(LA0/h;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LA/W;

    .line 8
    .line 9
    iget-object v0, p0, LA/v;->r:LA/W;

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-object p1, p0, LA/v;->r:LA/W;

    .line 18
    .line 19
    iget-object v0, p0, LA/v;->q:LB5/c;

    .line 20
    .line 21
    invoke-interface {v0, p1}, LB5/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LA/v;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LA/v;

    .line 12
    .line 13
    iget-object p1, p1, LA/v;->q:LB5/c;

    .line 14
    .line 15
    iget-object v1, p0, LA/v;->q:LB5/c;

    .line 16
    .line 17
    if-ne p1, v1, :cond_2

    .line 18
    .line 19
    return v0

    .line 20
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LA/v;->q:LB5/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
