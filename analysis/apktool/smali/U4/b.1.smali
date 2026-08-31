.class public final synthetic LU4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Z

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:F


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;FI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LU4/b;->q:Z

    iput-object p2, p0, LU4/b;->r:Ljava/lang/String;

    iput p3, p0, LU4/b;->s:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, LP/o;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/16 p2, 0xc37

    .line 9
    .line 10
    invoke-static {p2}, LP/b;->w(I)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iget-boolean v0, p0, LU4/b;->q:Z

    .line 15
    .line 16
    iget-object v1, p0, LU4/b;->r:Ljava/lang/String;

    .line 17
    .line 18
    iget v2, p0, LU4/b;->s:F

    .line 19
    .line 20
    invoke-static {v0, v1, v2, p1, p2}, LU4/a;->l(ZLjava/lang/String;FLP/o;I)V

    .line 21
    .line 22
    .line 23
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 24
    .line 25
    return-object p1
.end method
