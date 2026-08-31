.class public final synthetic LU4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Z

.field public final synthetic s:I


# direct methods
.method public synthetic constructor <init>(IILjava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LU4/d;->q:Ljava/lang/String;

    iput-boolean p4, p0, LU4/d;->r:Z

    iput p2, p0, LU4/d;->s:I

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
    const/4 p2, 0x1

    .line 9
    invoke-static {p2}, LP/b;->w(I)I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iget-object v0, p0, LU4/d;->q:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v1, p0, LU4/d;->r:Z

    .line 16
    .line 17
    iget v2, p0, LU4/d;->s:I

    .line 18
    .line 19
    invoke-static {v0, v1, p1, p2, v2}, LU4/a;->m(Ljava/lang/String;ZLP/o;II)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 23
    .line 24
    return-object p1
.end method
