.class public final La6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV5/a;


# static fields
.field public static final a:La6/g;

.field public static final b:La6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La6/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La6/g;->a:La6/g;

    .line 7
    .line 8
    sget-object v0, La6/f;->b:La6/f;

    .line 9
    .line 10
    sput-object v0, La6/g;->b:La6/f;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b()LX5/f;
    .locals 1

    .line 1
    sget-object v0, La6/g;->b:La6/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LY5/b;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p1}, LD5/a;->m(LY5/b;)Lb6/i;

    .line 2
    .line 3
    .line 4
    new-instance v0, La6/e;

    .line 5
    .line 6
    sget-object v1, La6/n;->a:La6/n;

    .line 7
    .line 8
    new-instance v2, LZ5/c;

    .line 9
    .line 10
    invoke-direct {v2, v1}, LZ5/c;-><init>(LV5/a;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, p1}, LZ5/a;->c(LY5/b;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ljava/util/List;

    .line 18
    .line 19
    invoke-direct {v0, p1}, La6/e;-><init>(Ljava/util/List;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method
