.class public final LP4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO4/b;


# static fields
.field public static final a:LP4/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LP4/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LP4/c;->a:LP4/c;

    .line 7
    .line 8
    new-instance v0, LK2/j;

    .line 9
    .line 10
    const/4 v1, 0x4

    .line 11
    invoke-direct {v0, v1}, LK2/j;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lm5/a;->d(LB5/a;)Lm5/o;

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final getFontRes()I
    .locals 1

    .line 1
    const/high16 v0, 0x7f080000

    .line 2
    .line 3
    return v0
.end method

.method public final getIcon(Ljava/lang/String;)LO4/a;
    .locals 0

    .line 1
    invoke-static {p1}, LP4/b;->valueOf(Ljava/lang/String;)LP4/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getMappingPrefix()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "fab"

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRawTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/google/android/gms/internal/measurement/n2;->w(LO4/b;)Landroid/graphics/Typeface;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
