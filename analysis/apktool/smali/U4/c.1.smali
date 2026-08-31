.class public final synthetic LU4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB5/e;


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Z

.field public final synthetic t:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;ZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, LU4/c;->q:I

    iput-object p2, p0, LU4/c;->r:Ljava/lang/String;

    iput-boolean p3, p0, LU4/c;->s:Z

    iput p5, p0, LU4/c;->t:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, LP/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, LP/b;->w(I)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    iget v0, p0, LU4/c;->q:I

    .line 15
    .line 16
    iget-object v1, p0, LU4/c;->r:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v2, p0, LU4/c;->s:Z

    .line 19
    .line 20
    iget v5, p0, LU4/c;->t:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, LU4/a;->t(ILjava/lang/String;ZLP/o;II)V

    .line 23
    .line 24
    .line 25
    sget-object p1, Lm5/y;->a:Lm5/y;

    .line 26
    .line 27
    return-object p1
.end method
